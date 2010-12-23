/**
 * 
 */
package cn.edu.pku.sei.ra.wrapping.CommonWrapping.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingPackage;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;

/**
 * @author song
 *
 */
public class WrappingEObjectAdapterImpl extends AdapterImpl {

	/**
	 * 
	 */
	public WrappingEObjectAdapterImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public void notifyChanged(Notification msg){
		WrappingEObject notifier=(WrappingEObject)msg.getNotifier();
		if(msg.getEventType()==Notification.SET &&
				notifier.getWaitingFeature()!=WrappingEObject.NO_WAITING &&
				msg.getFeatureID(WrappingEObject.class)!=
					CommonWrappingPackage.WRAPPING_EOBJECT__NEWBORN &&
				msg.getFeatureID(WrappingEObject.class)!=
					CommonWrappingPackage.WRAPPING_EOBJECT__WAITING_FEATURE &&
				msg.getFeatureID(WrappingEObject.class)!=
					CommonWrappingPackage.WRAPPING_EOBJECT__DEAD &&
				msg.getFeatureID(WrappingEObject.class)!=
					CommonWrappingPackage.WRAPPING_EOBJECT__CORE &&
				notifier.eContainer()!=null
			){
			boolean res=((WrappingEObject)notifier.eContainer())
				.addSubCore(notifier, notifier.getWaitingFeature());
			if(res)
				notifier.setWaitingFeature(WrappingEObject.NO_WAITING);
		}	
				
	}

}
