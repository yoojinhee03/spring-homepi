//package com.example.homepi.config;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
////import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration /*  Database에 대한 접속 정보를 나타내고 있음.  */
//@MapperScan(basePackages = "com.example.homepi.dao.BoardDao") /*    설정된 패키지에서  mapper를 스캔하기 위함  */
////@EnableTransactionManagement /* TransactionManager를 적용할 것인지에 대해 설정하는 annotation */
//public class DatabaseConfig {
//
//    @Bean /* DataSource를 parameter로 받아서 .sqlSessionFactory를 생성*/
//    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();  /*  객체를 생성하여서 SessionTemplate 인자로 넘겨주기 위하여 사용*/
//        sessionFactory.setDataSource(dataSource); /* dataSource를 설정  */
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(); /*    실제로 쿼리문이 존재하는 .xml 파일 위치를 지정해주는 부분 */
//        //sessionFactory.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/*.xml")); /* 폴더가 없거나, xml 파일이 없거나, 문법 오류가 없어야 정상적으로 생성 */
//        return sessionFactory.getObject();
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception { /* 실제 DB에 사용되는 템플릿을 생성하여 반환 */
//        final SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory); /* 실제 db에 사용되는 객체를 생성하여 반환 */
//        return sqlSessionTemplate;
//    }
//}