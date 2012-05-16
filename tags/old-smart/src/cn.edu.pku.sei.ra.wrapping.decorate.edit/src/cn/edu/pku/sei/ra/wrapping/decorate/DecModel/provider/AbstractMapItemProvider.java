/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel.provider;


import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelFactory;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractMapItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMapItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSpecTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Spec Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractMap_specType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractMap_specType_feature", "_UI_AbstractMap_type"),
				 DecModelPackage.Literals.ABSTRACT_MAP__SPEC_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DecModelPackage.Literals.ABSTRACT_MAP__SPEC_CODE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractMap)object).getSpecType();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractMap_type") :
			getString("_UI_AbstractMap_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractMap.class)) {
			case DecModelPackage.ABSTRACT_MAP__SPEC_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DecModelPackage.ABSTRACT_MAP__SPEC_CODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DecModelPackage.Literals.ABSTRACT_MAP__SPEC_CODE,
				 DecModelFactory.eINSTANCE.createCreate()));

		newChildDescriptors.add
			(createChildParameter
				(DecModelPackage.Literals.ABSTRACT_MAP__SPEC_CODE,
				 DecModelFactory.eINSTANCE.createDestroy()));

		newChildDescriptors.add
			(createChildParameter
				(DecModelPackage.Literals.ABSTRACT_MAP__SPEC_CODE,
				 DecModelFactory.eINSTANCE.createLookup()));

		newChildDescriptors.add
			(createChildParameter
				(DecModelPackage.Literals.ABSTRACT_MAP__SPEC_CODE,
				 DecModelFactory.eINSTANCE.createIdentify()));

		newChildDescriptors.add
			(createChildParameter
				(DecModelPackage.Literals.ABSTRACT_MAP__SPEC_CODE,
				 DecModelFactory.eINSTANCE.createGet()));

		newChildDescriptors.add
			(createChildParameter
				(DecModelPackage.Literals.ABSTRACT_MAP__SPEC_CODE,
				 DecModelFactory.eINSTANCE.createSet()));

		newChildDescriptors.add
			(createChildParameter
				(DecModelPackage.Literals.ABSTRACT_MAP__SPEC_CODE,
				 DecModelFactory.eINSTANCE.createListSub()));

		newChildDescriptors.add
			(createChildParameter
				(DecModelPackage.Literals.ABSTRACT_MAP__SPEC_CODE,
				 DecModelFactory.eINSTANCE.createInsert()));

		newChildDescriptors.add
			(createChildParameter
				(DecModelPackage.Literals.ABSTRACT_MAP__SPEC_CODE,
				 DecModelFactory.eINSTANCE.createRemove()));

		newChildDescriptors.add
			(createChildParameter
				(DecModelPackage.Literals.ABSTRACT_MAP__SPEC_CODE,
				 DecModelFactory.eINSTANCE.createUtilMethod()));

		newChildDescriptors.add
			(createChildParameter
				(DecModelPackage.Literals.ABSTRACT_MAP__SPEC_CODE,
				 DecModelFactory.eINSTANCE.createUtilField()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DecModelEditPlugin.INSTANCE;
	}

}
