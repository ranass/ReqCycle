/**
 */
package org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.TraceableElement#getOutgoings <em>Outgoings</em>}</li>
 *   <li>{@link org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.TraceableElement#getIncomings <em>Incomings</em>}</li>
 *   <li>{@link org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.TraceableElement#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.CacheTracabilityPackage#getTraceableElement()
 * @model
 * @generated
 */
public interface TraceableElement extends URIElement {
	/**
	 * Returns the value of the '<em><b>Outgoings</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.TraceabilityLink}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.TraceabilityLink#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoings</em>' reference list.
	 * @see org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.CacheTracabilityPackage#getTraceableElement_Outgoings()
	 * @see org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.TraceabilityLink#getSources
	 * @model opposite="sources"
	 * @generated
	 */
	EList<TraceabilityLink> getOutgoings();

	/**
	 * Returns the value of the '<em><b>Incomings</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.TraceabilityLink}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.TraceabilityLink#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incomings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomings</em>' reference list.
	 * @see org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.CacheTracabilityPackage#getTraceableElement_Incomings()
	 * @see org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.TraceabilityLink#getTargets
	 * @model opposite="targets"
	 * @generated
	 */
	EList<TraceabilityLink> getIncomings();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.reqcycle.traceability.cache.emfbased.model.CacheTracability.CacheTracabilityPackage#getTraceableElement_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // TraceableElement
