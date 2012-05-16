package ie.tcd.rm.test.filesys.engine.actions;

import ie.tcd.rm.test.filesys.engin.FileChanges;
import ie.tcd.test.filesys.presentation.FileSysEditor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class EventReplay implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;
	
	
	public static List<String> events = null;
	
	public static EObject root = null;
	public static Resource res = null;
	
	public static int curr=0;
	/**
	 * The constructor.
	 */
	public EventReplay() {
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		
		IWorkbenchPage page = window.getActivePage();
		IEditorPart part = page.getActiveEditor();
		if(!(part instanceof FileSysEditor)){
			return;
		}
		FileSysEditor fe = (FileSysEditor) part;
		
		if(events == null){
			try{
				events = new ArrayList<String>();
				FileReader f = new FileReader("C:\\Users\\Hui\\work\\event-data\\scl-simp.csv");
				BufferedReader r = new BufferedReader(f);
				String s = null;
				while((s = r.readLine())!=null){
					events.add(s);
				}
				r.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		if(root==null){
			res =  fe.getEditingDomain().getResourceSet().getResources().get(0);		
			root = res.getContents().get(0);
		}
		
		FileChanges engine = new FileChanges();
		Map<String, EObject> context = new HashMap<String,EObject>();
		context.put("root", root);
		engine.init(context);
		if(curr < events.size())
			engine.execute(events.get(curr));
		curr ++;				
		
	}

	/**
	 * Selection in the workbench has been changed. We 
	 * can change the state of the 'real' action here
	 * if we want, but this can only happen after 
	 * the delegate has been created.
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system
	 * resources we previously allocated.
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to
	 * be able to provide parent shell for the message dialog.
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}