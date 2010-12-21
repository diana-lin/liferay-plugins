/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.model;

/**
 * <p>
 * This class is a wrapper for {@link KaleoTaskInstanceToken}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       KaleoTaskInstanceToken
 * @generated
 */
public class KaleoTaskInstanceTokenWrapper implements KaleoTaskInstanceToken {
	public KaleoTaskInstanceTokenWrapper(
		KaleoTaskInstanceToken kaleoTaskInstanceToken) {
		_kaleoTaskInstanceToken = kaleoTaskInstanceToken;
	}

	/**
	* Gets the primary key of this kaleo task instance token.
	*
	* @return the primary key of this kaleo task instance token
	*/
	public long getPrimaryKey() {
		return _kaleoTaskInstanceToken.getPrimaryKey();
	}

	/**
	* Sets the primary key of this kaleo task instance token
	*
	* @param pk the primary key of this kaleo task instance token
	*/
	public void setPrimaryKey(long pk) {
		_kaleoTaskInstanceToken.setPrimaryKey(pk);
	}

	/**
	* Gets the kaleo task instance token ID of this kaleo task instance token.
	*
	* @return the kaleo task instance token ID of this kaleo task instance token
	*/
	public long getKaleoTaskInstanceTokenId() {
		return _kaleoTaskInstanceToken.getKaleoTaskInstanceTokenId();
	}

	/**
	* Sets the kaleo task instance token ID of this kaleo task instance token.
	*
	* @param kaleoTaskInstanceTokenId the kaleo task instance token ID of this kaleo task instance token
	*/
	public void setKaleoTaskInstanceTokenId(long kaleoTaskInstanceTokenId) {
		_kaleoTaskInstanceToken.setKaleoTaskInstanceTokenId(kaleoTaskInstanceTokenId);
	}

	/**
	* Gets the group ID of this kaleo task instance token.
	*
	* @return the group ID of this kaleo task instance token
	*/
	public long getGroupId() {
		return _kaleoTaskInstanceToken.getGroupId();
	}

	/**
	* Sets the group ID of this kaleo task instance token.
	*
	* @param groupId the group ID of this kaleo task instance token
	*/
	public void setGroupId(long groupId) {
		_kaleoTaskInstanceToken.setGroupId(groupId);
	}

	/**
	* Gets the company ID of this kaleo task instance token.
	*
	* @return the company ID of this kaleo task instance token
	*/
	public long getCompanyId() {
		return _kaleoTaskInstanceToken.getCompanyId();
	}

	/**
	* Sets the company ID of this kaleo task instance token.
	*
	* @param companyId the company ID of this kaleo task instance token
	*/
	public void setCompanyId(long companyId) {
		_kaleoTaskInstanceToken.setCompanyId(companyId);
	}

	/**
	* Gets the user ID of this kaleo task instance token.
	*
	* @return the user ID of this kaleo task instance token
	*/
	public long getUserId() {
		return _kaleoTaskInstanceToken.getUserId();
	}

	/**
	* Sets the user ID of this kaleo task instance token.
	*
	* @param userId the user ID of this kaleo task instance token
	*/
	public void setUserId(long userId) {
		_kaleoTaskInstanceToken.setUserId(userId);
	}

	/**
	* Gets the user uuid of this kaleo task instance token.
	*
	* @return the user uuid of this kaleo task instance token
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTaskInstanceToken.getUserUuid();
	}

	/**
	* Sets the user uuid of this kaleo task instance token.
	*
	* @param userUuid the user uuid of this kaleo task instance token
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_kaleoTaskInstanceToken.setUserUuid(userUuid);
	}

	/**
	* Gets the user name of this kaleo task instance token.
	*
	* @return the user name of this kaleo task instance token
	*/
	public java.lang.String getUserName() {
		return _kaleoTaskInstanceToken.getUserName();
	}

	/**
	* Sets the user name of this kaleo task instance token.
	*
	* @param userName the user name of this kaleo task instance token
	*/
	public void setUserName(java.lang.String userName) {
		_kaleoTaskInstanceToken.setUserName(userName);
	}

	/**
	* Gets the create date of this kaleo task instance token.
	*
	* @return the create date of this kaleo task instance token
	*/
	public java.util.Date getCreateDate() {
		return _kaleoTaskInstanceToken.getCreateDate();
	}

	/**
	* Sets the create date of this kaleo task instance token.
	*
	* @param createDate the create date of this kaleo task instance token
	*/
	public void setCreateDate(java.util.Date createDate) {
		_kaleoTaskInstanceToken.setCreateDate(createDate);
	}

	/**
	* Gets the modified date of this kaleo task instance token.
	*
	* @return the modified date of this kaleo task instance token
	*/
	public java.util.Date getModifiedDate() {
		return _kaleoTaskInstanceToken.getModifiedDate();
	}

	/**
	* Sets the modified date of this kaleo task instance token.
	*
	* @param modifiedDate the modified date of this kaleo task instance token
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_kaleoTaskInstanceToken.setModifiedDate(modifiedDate);
	}

	/**
	* Gets the kaleo definition ID of this kaleo task instance token.
	*
	* @return the kaleo definition ID of this kaleo task instance token
	*/
	public long getKaleoDefinitionId() {
		return _kaleoTaskInstanceToken.getKaleoDefinitionId();
	}

	/**
	* Sets the kaleo definition ID of this kaleo task instance token.
	*
	* @param kaleoDefinitionId the kaleo definition ID of this kaleo task instance token
	*/
	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoTaskInstanceToken.setKaleoDefinitionId(kaleoDefinitionId);
	}

	/**
	* Gets the kaleo instance ID of this kaleo task instance token.
	*
	* @return the kaleo instance ID of this kaleo task instance token
	*/
	public long getKaleoInstanceId() {
		return _kaleoTaskInstanceToken.getKaleoInstanceId();
	}

	/**
	* Sets the kaleo instance ID of this kaleo task instance token.
	*
	* @param kaleoInstanceId the kaleo instance ID of this kaleo task instance token
	*/
	public void setKaleoInstanceId(long kaleoInstanceId) {
		_kaleoTaskInstanceToken.setKaleoInstanceId(kaleoInstanceId);
	}

	/**
	* Gets the kaleo instance token ID of this kaleo task instance token.
	*
	* @return the kaleo instance token ID of this kaleo task instance token
	*/
	public long getKaleoInstanceTokenId() {
		return _kaleoTaskInstanceToken.getKaleoInstanceTokenId();
	}

	/**
	* Sets the kaleo instance token ID of this kaleo task instance token.
	*
	* @param kaleoInstanceTokenId the kaleo instance token ID of this kaleo task instance token
	*/
	public void setKaleoInstanceTokenId(long kaleoInstanceTokenId) {
		_kaleoTaskInstanceToken.setKaleoInstanceTokenId(kaleoInstanceTokenId);
	}

	/**
	* Gets the kaleo task ID of this kaleo task instance token.
	*
	* @return the kaleo task ID of this kaleo task instance token
	*/
	public long getKaleoTaskId() {
		return _kaleoTaskInstanceToken.getKaleoTaskId();
	}

	/**
	* Sets the kaleo task ID of this kaleo task instance token.
	*
	* @param kaleoTaskId the kaleo task ID of this kaleo task instance token
	*/
	public void setKaleoTaskId(long kaleoTaskId) {
		_kaleoTaskInstanceToken.setKaleoTaskId(kaleoTaskId);
	}

	/**
	* Gets the kaleo task name of this kaleo task instance token.
	*
	* @return the kaleo task name of this kaleo task instance token
	*/
	public java.lang.String getKaleoTaskName() {
		return _kaleoTaskInstanceToken.getKaleoTaskName();
	}

	/**
	* Sets the kaleo task name of this kaleo task instance token.
	*
	* @param kaleoTaskName the kaleo task name of this kaleo task instance token
	*/
	public void setKaleoTaskName(java.lang.String kaleoTaskName) {
		_kaleoTaskInstanceToken.setKaleoTaskName(kaleoTaskName);
	}

	/**
	* Gets the class name of this kaleo task instance token.
	*
	* @return the class name of this kaleo task instance token
	*/
	public java.lang.String getClassName() {
		return _kaleoTaskInstanceToken.getClassName();
	}

	/**
	* Sets the class name of this kaleo task instance token.
	*
	* @param className the class name of this kaleo task instance token
	*/
	public void setClassName(java.lang.String className) {
		_kaleoTaskInstanceToken.setClassName(className);
	}

	/**
	* Gets the class p k of this kaleo task instance token.
	*
	* @return the class p k of this kaleo task instance token
	*/
	public long getClassPK() {
		return _kaleoTaskInstanceToken.getClassPK();
	}

	/**
	* Sets the class p k of this kaleo task instance token.
	*
	* @param classPK the class p k of this kaleo task instance token
	*/
	public void setClassPK(long classPK) {
		_kaleoTaskInstanceToken.setClassPK(classPK);
	}

	/**
	* Gets the completion user ID of this kaleo task instance token.
	*
	* @return the completion user ID of this kaleo task instance token
	*/
	public long getCompletionUserId() {
		return _kaleoTaskInstanceToken.getCompletionUserId();
	}

	/**
	* Sets the completion user ID of this kaleo task instance token.
	*
	* @param completionUserId the completion user ID of this kaleo task instance token
	*/
	public void setCompletionUserId(long completionUserId) {
		_kaleoTaskInstanceToken.setCompletionUserId(completionUserId);
	}

	/**
	* Gets the completion user uuid of this kaleo task instance token.
	*
	* @return the completion user uuid of this kaleo task instance token
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getCompletionUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTaskInstanceToken.getCompletionUserUuid();
	}

	/**
	* Sets the completion user uuid of this kaleo task instance token.
	*
	* @param completionUserUuid the completion user uuid of this kaleo task instance token
	*/
	public void setCompletionUserUuid(java.lang.String completionUserUuid) {
		_kaleoTaskInstanceToken.setCompletionUserUuid(completionUserUuid);
	}

	/**
	* Gets the completed of this kaleo task instance token.
	*
	* @return the completed of this kaleo task instance token
	*/
	public boolean getCompleted() {
		return _kaleoTaskInstanceToken.getCompleted();
	}

	/**
	* Determines if this kaleo task instance token is completed.
	*
	* @return <code>true</code> if this kaleo task instance token is completed; <code>false</code> otherwise
	*/
	public boolean isCompleted() {
		return _kaleoTaskInstanceToken.isCompleted();
	}

	/**
	* Sets whether this kaleo task instance token is completed.
	*
	* @param completed the completed of this kaleo task instance token
	*/
	public void setCompleted(boolean completed) {
		_kaleoTaskInstanceToken.setCompleted(completed);
	}

	/**
	* Gets the completion date of this kaleo task instance token.
	*
	* @return the completion date of this kaleo task instance token
	*/
	public java.util.Date getCompletionDate() {
		return _kaleoTaskInstanceToken.getCompletionDate();
	}

	/**
	* Sets the completion date of this kaleo task instance token.
	*
	* @param completionDate the completion date of this kaleo task instance token
	*/
	public void setCompletionDate(java.util.Date completionDate) {
		_kaleoTaskInstanceToken.setCompletionDate(completionDate);
	}

	/**
	* Gets the due date of this kaleo task instance token.
	*
	* @return the due date of this kaleo task instance token
	*/
	public java.util.Date getDueDate() {
		return _kaleoTaskInstanceToken.getDueDate();
	}

	/**
	* Sets the due date of this kaleo task instance token.
	*
	* @param dueDate the due date of this kaleo task instance token
	*/
	public void setDueDate(java.util.Date dueDate) {
		_kaleoTaskInstanceToken.setDueDate(dueDate);
	}

	/**
	* Gets the workflow context of this kaleo task instance token.
	*
	* @return the workflow context of this kaleo task instance token
	*/
	public java.lang.String getWorkflowContext() {
		return _kaleoTaskInstanceToken.getWorkflowContext();
	}

	/**
	* Sets the workflow context of this kaleo task instance token.
	*
	* @param workflowContext the workflow context of this kaleo task instance token
	*/
	public void setWorkflowContext(java.lang.String workflowContext) {
		_kaleoTaskInstanceToken.setWorkflowContext(workflowContext);
	}

	public boolean isNew() {
		return _kaleoTaskInstanceToken.isNew();
	}

	public void setNew(boolean n) {
		_kaleoTaskInstanceToken.setNew(n);
	}

	public boolean isCachedModel() {
		return _kaleoTaskInstanceToken.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_kaleoTaskInstanceToken.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _kaleoTaskInstanceToken.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_kaleoTaskInstanceToken.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _kaleoTaskInstanceToken.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _kaleoTaskInstanceToken.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_kaleoTaskInstanceToken.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new KaleoTaskInstanceTokenWrapper((KaleoTaskInstanceToken)_kaleoTaskInstanceToken.clone());
	}

	public int compareTo(
		com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken kaleoTaskInstanceToken) {
		return _kaleoTaskInstanceToken.compareTo(kaleoTaskInstanceToken);
	}

	public int hashCode() {
		return _kaleoTaskInstanceToken.hashCode();
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken toEscapedModel() {
		return new KaleoTaskInstanceTokenWrapper(_kaleoTaskInstanceToken.toEscapedModel());
	}

	public java.lang.String toString() {
		return _kaleoTaskInstanceToken.toString();
	}

	public java.lang.String toXmlString() {
		return _kaleoTaskInstanceToken.toXmlString();
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken getKaleoInstanceToken()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTaskInstanceToken.getKaleoInstanceToken();
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTask getKaleoTask()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTaskInstanceToken.getKaleoTask();
	}

	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance> getKaleoTaskAssignmentInstances()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTaskInstanceToken.getKaleoTaskAssignmentInstances();
	}

	public KaleoTaskInstanceToken getWrappedKaleoTaskInstanceToken() {
		return _kaleoTaskInstanceToken;
	}

	private KaleoTaskInstanceToken _kaleoTaskInstanceToken;
}