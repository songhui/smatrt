package ie.tcd.rm.test.filesys.engin;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class JavaFileAPIAdapter extends AdapterImpl {
  public void notifyChanged(final Notification notification) {
    StackTraceElement[] st = Thread.currentThread().getStackTrace();
    for(int i=0; i<st.length; i++){
    	if(st[i].getMethodName().startsWith("_operation_"))
    		return;
    }
    Object notifier = notification.getNotifier();
    EStructuralFeature feature = (EStructuralFeature)notification.getFeature();
    Object newvalue = notification.getNewValue();
    if((Notification.ADD==notification.getEventType()) && (notifier instanceof ie.tcd.test.filesys.EFolder)){
    	JavaFileAPI root = JavaFileAPI.resolveInstance(((ie.tcd.test.filesys.EFolder)notifier).eResource());
    	AddFile invk = new AddFile();
    	invk.apiRoot = root;
    	invk._operation_ADD_EFolder_subfiles((ie.tcd.test.filesys.EFolder)notifier,feature,newvalue);
    }
  }
  
  public static JavaFileAPIAdapter INSTANCE = new JavaFileAPIAdapter();
}
