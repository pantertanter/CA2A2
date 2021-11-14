CA2A2 startkode er en JAVA backend som har forskellige packages med classer i.

workflows
	mavenworkflow.yml
		Set up connection to database 
		Tomcat deploy file w.secrets.REMOTE_USER and secrets.REMOTE_PW

.idea
	.gitignore
		ignored files for github
	compiler.xml
		How the program will compile the code.
	dataSources.local.xml
		As the name implies, data-source information:
			Database-info: database management system="MYSQL"
	dataSouces.xml
			driver : 8
			synchronize : true
			jdbc-driver : com.mysql.cj.jdbc.Driver
			jdbc - url : jdbc:mysql://localhost:3306/startcode
			working-dir : $ProjectFileDir$
	encodings.xml
						
	jarRepositories.xml
	
	jpa-buddy.xml
	
	misc.xml
	 	languageLevel="JDK_11"
	
	runConfigurations.xml
		Configurerations for the program
			Maven
			Artifact
			Manager
					
	vcs.xml
	
	workspace.xml

.settings
	org.eclipse.core.resources.prefs
	org.eclipse.jdt.apt.core.prefs
	org.eclipse.jdt.core.prefs
	org.eclipse.m2e.coreprefs

CorsFilter
	Standard cors filter configureations
	
	deserializer
	WikipediaArticleDeserializer

dtos:
	funstuff:
	BreadJokeDTO
	CatFactDTO
	ChuckJokeDTO
	CombinedFunStuffDTO
	DadJokeDTO
	FriendsQuoteDTO
	GeekJokeDTO
	SingleLineJokeDTO
	YoMamaJokeDTO
		RenameMeDTO
		WikipediaArticleDTO:

Entities:
	RenameMe

	Role
 
	User

Errorhandling:

	API_Execption

	API_Exception_Mapper

	ExceptionDTO

	Generic ExceptionMapper

	Not found Exception

Facades:

	FacadeExample

	Populator

	UserFacade

Rest:
	Endpoints:

		ApplicationConfig

		DemoResource

		RenameMeResouce

Security:
	errorhandling
		AuthenticationException
		AuthenticationExceptionMapper
		NotAuthorizedExceptionMapper
		JWTAutenticationFilter
		JWTSecurityContext
		LoginEndPoint
		RolesAllowedFilter
		SharedSecret
		UserPrincipal
Utils
	EMF_Creator
	HttpUtils
	SetupTestUsers
	Utility

Facades:
	FacadeExampleTest

Rest:
	DemoResourceTest
	LoginEndpointTest
	RenameMeResourceTest

Target:
	classes
	cors
	CorsFilter
	deserializer
	dtos
	entities
	errorhandling
	facades
	META-INF
	rest
	security
	utils
	properties-from-pom.properties
	generated-sources
	generated-test-sources
	startcode-1.0.1
	test-classes
	
	.classpath
	.gitignore
	.project
	pom.xml
	README.md


