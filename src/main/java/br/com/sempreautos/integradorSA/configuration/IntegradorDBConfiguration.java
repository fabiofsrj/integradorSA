package br.com.sempreautos.integradorSA.configuration;

import java.util.HashMap;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import com.google.common.base.Preconditions;

@Configuration
@PropertySource({"classpath:configuracaoCamadaPersistencia.properties"})
@EnableJpaRepositories(basePackages="br.com.sempreautos.integradorSA.repository.integrador", entityManagerFactoryRef="integradorEntityManager", transactionManagerRef="integradorTransactionManager")
public class IntegradorDBConfiguration {
	
	@Autowired
	private Environment env;
	
	public IntegradorDBConfiguration(){
		super();
	}
	
	@Primary
	@Bean
	public LocalContainerEntityManagerFactoryBean integradorEntityManager() {
       
		System.out.println("Autoddl:" + env.getProperty("hibernate.hbm2ddl.auto"));
		System.out.println("Dialeto:" + env.getProperty("hibernate.dialect"));
		
		
		final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(integradorDataSource());
        em.setPackagesToScan(new String[] { "br.com.sempreautos.integradorSA.model.integrador" });

        final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        final HashMap<String, Object> properties = new HashMap<String, Object>();
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        em.setJpaPropertyMap(properties);

        return em;
    }
	
	@Primary
    @Bean
    public DataSource integradorDataSource() {

		System.out.println("Driver Integrador:" + env.getProperty("integrador.jdbc.driverClassName"));
		System.out.println("URL Integrador:" + env.getProperty("integrador.jdbc.url"));
		System.out.println("Usuário Integrador:" + env.getProperty("integrador.jdbc.user"));
		System.out.println("Senha Integrador:" + env.getProperty("integrador.jdbc.pass"));
		
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(Preconditions.checkNotNull(env.getProperty("integrador.jdbc.driverClassName")));
        dataSource.setUrl(Preconditions.checkNotNull(env.getProperty("integrador.jdbc.url")));
        dataSource.setUsername(Preconditions.checkNotNull(env.getProperty("integrador.jdbc.user")));
        dataSource.setPassword(Preconditions.checkNotNull(env.getProperty("integrador.jdbc.pass")));

        return dataSource;
    }

    @Primary
    @Bean
    public PlatformTransactionManager integradorTransactionManager() {
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(integradorEntityManager().getObject());
        return transactionManager;
    }

}
