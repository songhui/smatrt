package cn.edu.pku.rm.learnapi.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;

import cn.edu.pku.rm.learnapi.Combinator;
import cn.edu.pku.rm.learnapi.SourceSampleUtil;
import cn.edu.pku.rm.learnapi.TraceBuilder;
import cn.edu.pku.rm.learnapi.Tracer;
import cn.edu.pku.rm.learnapi.meta.MetaConstructUtil;
import cn.edu.pku.rm.learnapi.meta.MetaConstructor;
import cn.edu.pku.rm.learnapi.visitors.ClassDeclarationVisitor;
import cn.edu.pku.rm.learnapi.visitors.MethodDeclarationVisitor;
import cn.edu.pku.sei.ra.dt.Repository;

public class TestJOnASAll extends TestCase {
	
	public static class Paras{
		
		String name="";
		
		String form="";
		String action="";
		String method="";
		
		
		public Paras(String name, String form,String action,String method){
			this.name=name;
			this.form=form;
			this.action=action;
			this.method=method;
		}
	}
	
	public void testJOnASAll() throws JavaModelException, IOException{
		
		Paras[] allparas=new Paras[]{
			new Paras(
					"EJB",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/ejb/EjbForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/ejb/EditEjbAction.java",
					"fillEjbGlobalInfo"
			),
			new Paras(
					"EntityEJB",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/ejb/EjbEntityForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/ejb/EditEjbEntityAction.java",
					"fillEjbInfo"
			),
			new Paras(
					"MessageEJB",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/ejb/EjbMessageForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/ejb/EditEjbMessageAction.java",
					"fillEjbInfo"
			),
			new Paras(
					"SessionEJB",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/ejb/EjbSessionForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/ejb/EditEjbSessionAction.java",
					"fillEjbInfo"
			),
			new Paras(
					"EjbSessionSblEJB",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/ejb/EjbSessionSblForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/ejb/EditEjbSessionSblAction.java",
					"fillEjbInfo"
			),
			new Paras(
					"DataSource",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/db/DatasourceForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/db/EditDatasourceAction.java",
					"populate"
				),
			new Paras(
					"Container",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/container/ContainerForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/container/EditContainerAction.java",
					"executeAction"
				),
			new Paras(
					"WebApp",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/container/WebAppForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/container/EditWebAppAction.java",
					"executeAction"
				),
			new Paras(
					"War",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/container/WarForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/container/EditWarAction.java",
					"executeAction"
				),
			new Paras(
					"Ear",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/container/EarForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/container/EditEarAction.java",
					"executeAction"
				),
			new Paras(
					"FactoryRealm",
					"src/org/objectweb/jonas/webapp/jonasadmin/security/MemoryRealmForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/security/EditMemoryRealmAction.java",					
					"executeAction"
				),
			new Paras(
					"ResourceAdapter",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/resource/ResourceAdapterForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/resource/EditResourceAdapterAction.java",
					"populate"
				),
			new Paras(
					"Jms",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/jms/ResourceAdapterForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/jms/EditJmsServiceAction.java",
					"executeAction"
				),
			new Paras(
					"MailFactory",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/mail/MailFactoryForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/mail/EditMailFactoryAction.java",
					
					"populate"
				),
			new Paras(
					"JtmService",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/jtm/JtmServiceForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/jtm/EditJtmServiceAction.java",
					
					"executeAction"
				),
			new Paras(
					"TransactionMonitor",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/jtm/JtmServiceMonitorForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/jtm/EditTransactionMonitorAction.java",
					
					"executeAction"
				),
			new Paras(
					"TransactionStatistic",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/jtm/JtmServiceStatisticForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/service/jtm/EditTransactionStatisticAction.java",
					
					"executeAction"
				),
//			new Paras(
//					"MemoryMonitoring",
//					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/EditMemoryAction.java",
//					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/MemoryForm.java",
//					"executeAction"
//				),
			new Paras(
					"EjbHaCluster",
					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/EjbHaClusterForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/EjbHaClusterAction.java",
					"executeAction"
			),
			new Paras(
					"EjbHaMember",
					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/EjbHaMemberForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/EjbHaMemberAction.java",
					"executeAction"
			),
			new Paras(
					"JkCluster",
					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/JkClusterForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/JkClusterAction.java",
					"executeAction"
			),
			new Paras(
					"JkMember",
					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/JkMemberForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/JkMemberAction.java",
					"executeAction"
			),
			new Paras(
					"LogicalCluster",
					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/LogicalClusterForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/LogicalClusterAction.java",
					"executeAction"
			),
			new Paras(
					"TomcatCluster",
					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/TomcatClusterForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/monitoring/TomcatClusterAction.java",
					"executeAction"
			),	
			new Paras(
					"Logging",
					"src/org/objectweb/jonas/webapp/jonasadmin/logging/CatalinaValveForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/logging/EditCatalinaAccessLoggerAction.java",
					
					"executeAction"
				),
			new Paras(
					"JOnASServer",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasserver/JonasServerForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasserver/EditJonasServerAction.java",
					
					"executeAction"
				),
			new Paras(
					"JMXServer",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasserver/EditJmxServerAction.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasserver/JmxForm.java",
					"executeAction"
				),
			new Paras(
					"Domain",
					"src/org/objectweb/jonas/webapp/jonasadmin/domain/DomainForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/domain/EditDomainAction.java",
					
					"executeAction"
				),
			new Paras(
					"Connector",
					"src/org/objectweb/jonas/webapp/jonasadmin/catalina/ConnectorForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/catalina/EditConnectorAction.java",
					
					"executeAction"
				),
			new Paras(
					"MqConnect",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasmqconnect/JonasMqConnectForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasmqconnect/JonasMqConnectAction.java",
					"executeAction"
				),
			new Paras(
					"Mdb",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasmqconnect/MdbEditForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasmqconnect/MdbEditAction.java",
					"executeAction"
				),
			new Paras(
					"Mdbs",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasmqconnect/MdbsForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasmqconnect/MdbsAction.java",
					"executeAction"
				),
			new Paras(
					"Destinations",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasmqconnect/DestinationsForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasmqconnect/DestinationsAction.java",
					"executeAction"
				),
			new Paras(
					"ServletServer",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasserver/ServletServerForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasserver/EditServletServerAction.java",
					"executeAction"
				),
			new Paras(
					"JonasMqConnectPlatform",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasmqconnect/JonasMqConnectPlatformForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/jonasmqconnect/JonasMqConnectPlatformAction.java",
					
					"executeAction"
				),
//			new Paras(
//					"JVM",
//					"src/org/objectweb/jonas/webapp/jonasadmin/jonasserver/JvmForm.java",
//					"src/org/objectweb/jonas/webapp/jonasadmin/jonasserver/EditJvmServerAction.java",
//					"executeAction"
//				),
				
			new Paras(
					"JoramUser",
					"src/org/objectweb/jonas/webapp/jonasadmin/joramplatform/JoramUserForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/joramplatform/EditJoramUserAction.java",
					"executeAction"
			),
			new Paras(
					"JoramTopic",
					"src/org/objectweb/jonas/webapp/jonasadmin/joramplatform/JoramTopicForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/joramplatform/EditJoramTopicAction.java",
					"executeAction"
			),
			new Paras(
					"JoramServers",
					"src/org/objectweb/jonas/webapp/jonasadmin/joramplatform/JoramServersForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/joramplatform/EditJoramServerAction.java",
					"executeAction"
			),
			new Paras(
					"JoramPlatform",
					"src/org/objectweb/jonas/webapp/jonasadmin/joramplatform/JoramPlatformForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/joramplatform/EditJoramPlatformAction.java",
					"executeAction"
			),
			new Paras(
					"JoramQueue",
					"src/org/objectweb/jonas/webapp/jonasadmin/joramplatform/JoramQueueForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/joramplatform/EditJoramQueueAction.java",
					"executeAction"
			),
			new Paras(
					"JoramLocalServer",
					"src/org/objectweb/jonas/webapp/jonasadmin/joramplatform/JoramLocalServerForm.java",
					"src/org/objectweb/jonas/webapp/jonasadmin/joramplatform/EditJoramLocalServerAction.java",
					"executeAction"
			)
			
				
		};
		
		EPackage res=EcoreFactory.eINSTANCE.createEPackage();
		EClass root=EcoreFactory.eINSTANCE.createEClass();
		root.setName("Root");
		res.getEClassifiers().add(root);
		
		for(int i=0;i<allparas.length;i++){
			EPackage partial=execute(allparas[i]);
			EClassifier cls=partial.getEClassifier("Root");
			cls.setName(allparas[i].name);
			EReference ref=EcoreFactory.eINSTANCE.createEReference();
			ref.setName(allparas[i].name);
			ref.setEType(cls);
			root.getEStructuralFeatures().add(ref);
			res.getEClassifiers().addAll(partial.getEClassifiers());
		}
		
		SourceSampleUtil.printResultOnFile("D:\\work\\APILearning\\testdata\\result-jonas-all.ecore",res);
		
	}
	
	public EPackage execute(Paras paras) throws IOException, JavaModelException{
		//ASTNode node=SourceSampleUtil.getInitialASTRoot("jvm-mouse","src/cn/edu/pku/jmxmouse/CopyOfJMXClient.java");
		SourceSampleUtil.API_PACKAGE=new String[]{
				"org.objectweb.jonas.jmx"
		};
		
		ASTNode node=SourceSampleUtil.getInitialASTRoot("jonasall",
				"src/org/objectweb/jonas/webapp/jonasadmin/JonasBaseAction.java");		
		ClassDeclarationVisitor visitor=new ClassDeclarationVisitor();
		node.accept(visitor);
		List<Repository> result=visitor.getResult();
		
		node=SourceSampleUtil.getInitialASTRoot("jonasall",paras.form);		
		visitor=new ClassDeclarationVisitor();
		node.accept(visitor);
		result.addAll(visitor.getResult());
		
		node=SourceSampleUtil.getInitialASTRoot("jonasall",paras.action);
		visitor=new ClassDeclarationVisitor();
		node.accept(visitor);
		result.addAll(visitor.getResult());
		
		
		
		Repository entry=new Combinator(result,paras.method).combine();
		
		
		entry.clearTemp();
		SourceSampleUtil.printResult(entry);
		
		MetaConstructor mc=new MetaConstructor("Test","http://mytest3");
		mc.parse(entry);
		
		EPackage res=mc.getResult();
		
		
		
		MetaConstructUtil.simplify(res);
		
		return res;
		
	}

}
