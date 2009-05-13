package cn.edu.pku.sei.ra.arch.C2.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import cn.edu.pku.sei.ra.arch.C2.C2Package;
import cn.edu.pku.sei.ra.arch.C2.diagram.part.C2DiagramEditorPlugin;

/**
 * @generated
 */
public class C2ElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private C2ElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Architecture_79 = getElementType("cn.edu.pku.sei.ra.arch.c2.diagram.Architecture_79"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Component_1001 = getElementType("cn.edu.pku.sei.ra.arch.c2.diagram.Component_1001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connector_1002 = getElementType("cn.edu.pku.sei.ra.arch.c2.diagram.Connector_1002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentBelow_3001 = getElementType("cn.edu.pku.sei.ra.arch.c2.diagram.ComponentBelow_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentAbove_3002 = getElementType("cn.edu.pku.sei.ra.arch.c2.diagram.ComponentAbove_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return C2DiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements
					.put(Architecture_79, C2Package.eINSTANCE.getArchitecture());

			elements.put(Component_1001, C2Package.eINSTANCE.getComponent());

			elements.put(Connector_1002, C2Package.eINSTANCE.getConnector());

			elements.put(ComponentBelow_3001, C2Package.eINSTANCE
					.getComponent_Below());

			elements.put(ComponentAbove_3002, C2Package.eINSTANCE
					.getComponent_Above());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Architecture_79);
			KNOWN_ELEMENT_TYPES.add(Component_1001);
			KNOWN_ELEMENT_TYPES.add(Connector_1002);
			KNOWN_ELEMENT_TYPES.add(ComponentBelow_3001);
			KNOWN_ELEMENT_TYPES.add(ComponentAbove_3002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
