package br.com.sempreautos.integradorSA.configuration;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@PropertySource({"classpath:configuracaoCamadaPersistencia.properties"})
@EnableJpaRepositories(basePackages = "br.com.sempreautos.integradorSA.repository.portal", entityManagerFactoryRef = "portalEntityManager", transactionManagerRef = "portalTransactionManager")
public class portalSADBConfiguration {

	@Autowired
	private Environment env;
	 
    @Bean
    public LocalContainerEntityManagerFactoryBean portalEntityManager() {
		System.out.println("Autoddl:" + env.getProperty("hibernate.hbm2ddl.auto"));
		System.out.println("Dialeto:" + env.getProperty("hibernate.dialect"));
    	
    	LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(portalDataSource());
        em.setPackagesToScan(new String[] {"br.com.sempreautos.integradorSA.model.portal"});
 
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        em.setJpaPropertyMap(properties);
 
        return em;
    }
	
    @Bean
    public DataSource portalDataSource() {
  
		System.out.println("Driver Portal:" + env.getProperty("portal.jdbc.driverClassName"));
		System.out.println("URL Portal:" + env.getProperty("portal.jdbc.url"));
		System.out.println("Usuário Portal:" + env.getProperty("portal.jdbc.user"));
		System.out.println("Senha Portal:" + env.getProperty("portal.jdbc.pass"));
    	
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("portal.jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("portal.jdbc.url"));
        dataSource.setUsername(env.getProperty("portal.jdbc.user"));
        dataSource.setPassword(env.getProperty("portal.jdbc.pass"));
 
        return dataSource;
    }
    
    @Bean
    public PlatformTransactionManager portalTransactionManager() {
  
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(portalEntityManager().getObject());
        return transactionManager;
    }    
}
