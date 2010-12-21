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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the KaleoTaskAssignmentInstance service. Represents a row in the &quot;KaleoTaskAssignmentInstance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskAssignmentInstanceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskAssignmentInstanceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTaskAssignmentInstance
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskAssignmentInstanceImpl
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskAssignmentInstanceModelImpl
 * @generated
 */
public interface KaleoTaskAssignmentInstanceModel extends BaseModel<KaleoTaskAssignmentInstance> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a kaleo task assignment instance model instance should use the {@link KaleoTaskAssignmentInstance} interface instead.
	 */

	/**
	 * Gets the primary key of this kaleo task assignment instance.
	 *
	 * @return the primary key of this kaleo task assignment instance
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kaleo task assignment instance
	 *
	 * @param pk the primary key of this kaleo task assignment instance
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the kaleo task assignment instance ID of this kaleo task assignment instance.
	 *
	 * @return the kaleo task assignment instance ID of this kaleo task assignment instance
	 */
	public long getKaleoTaskAssignmentInstanceId();

	/**
	 * Sets the kaleo task assignment instance ID of this kaleo task assignment instance.
	 *
	 * @param kaleoTaskAssignmentInstanceId the kaleo task assignment instance ID of this kaleo task assignment instance
	 */
	public void setKaleoTaskAssignmentInstanceId(
		long kaleoTaskAssignmentInstanceId);

	/**
	 * Gets the group ID of this kaleo task assignment instance.
	 *
	 * @return the group ID of this kaleo task assignment instance
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this kaleo task assignment instance.
	 *
	 * @param groupId the group ID of this kaleo task assignment instance
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this kaleo task assignment instance.
	 *
	 * @return the company ID of this kaleo task assignment instance
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this kaleo task assignment instance.
	 *
	 * @param companyId the company ID of this kaleo task assignment instance
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this kaleo task assignment instance.
	 *
	 * @return the user ID of this kaleo task assignment instance
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this kaleo task assignment instance.
	 *
	 * @param userId the user ID of this kaleo task assignment instance
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this kaleo task assignment instance.
	 *
	 * @return the user uuid of this kaleo task assignment instance
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this kaleo task assignment instance.
	 *
	 * @param userUuid the user uuid of this kaleo task assignment instance
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this kaleo task assignment instance.
	 *
	 * @return the user name of this kaleo task assignment instance
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this kaleo task assignment instance.
	 *
	 * @param userName the user name of this kaleo task assignment instance
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this kaleo task assignment instance.
	 *
	 * @return the create date of this kaleo task assignment instance
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this kaleo task assignment instance.
	 *
	 * @param createDate the create date of this kaleo task assignment instance
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this kaleo task assignment instance.
	 *
	 * @return the modified date of this kaleo task assignment instance
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this kaleo task assignment instance.
	 *
	 * @param modifiedDate the modified date of this kaleo task assignment instance
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the kaleo definition ID of this kaleo task assignment instance.
	 *
	 * @return the kaleo definition ID of this kaleo task assignment instance
	 */
	public long getKaleoDefinitionId();

	/**
	 * Sets the kaleo definition ID of this kaleo task assignment instance.
	 *
	 * @param kaleoDefinitionId the kaleo definition ID of this kaleo task assignment instance
	 */
	public void setKaleoDefinitionId(long kaleoDefinitionId);

	/**
	 * Gets the kaleo instance ID of this kaleo task assignment instance.
	 *
	 * @return the kaleo instance ID of this kaleo task assignment instance
	 */
	public long getKaleoInstanceId();

	/**
	 * Sets the kaleo instance ID of this kaleo task assignment instance.
	 *
	 * @param kaleoInstanceId the kaleo instance ID of this kaleo task assignment instance
	 */
	public void setKaleoInstanceId(long kaleoInstanceId);

	/**
	 * Gets the kaleo instance token ID of this kaleo task assignment instance.
	 *
	 * @return the kaleo instance token ID of this kaleo task assignment instance
	 */
	public long getKaleoInstanceTokenId();

	/**
	 * Sets the kaleo instance token ID of this kaleo task assignment instance.
	 *
	 * @param kaleoInstanceTokenId the kaleo instance token ID of this kaleo task assignment instance
	 */
	public void setKaleoInstanceTokenId(long kaleoInstanceTokenId);

	/**
	 * Gets the kaleo task instance token ID of this kaleo task assignment instance.
	 *
	 * @return the kaleo task instance token ID of this kaleo task assignment instance
	 */
	public long getKaleoTaskInstanceTokenId();

	/**
	 * Sets the kaleo task instance token ID of this kaleo task assignment instance.
	 *
	 * @param kaleoTaskInstanceTokenId the kaleo task instance token ID of this kaleo task assignment instance
	 */
	public void setKaleoTaskInstanceTokenId(long kaleoTaskInstanceTokenId);

	/**
	 * Gets the kaleo task ID of this kaleo task assignment instance.
	 *
	 * @return the kaleo task ID of this kaleo task assignment instance
	 */
	public long getKaleoTaskId();

	/**
	 * Sets the kaleo task ID of this kaleo task assignment instance.
	 *
	 * @param kaleoTaskId the kaleo task ID of this kaleo task assignment instance
	 */
	public void setKaleoTaskId(long kaleoTaskId);

	/**
	 * Gets the kaleo task name of this kaleo task assignment instance.
	 *
	 * @return the kaleo task name of this kaleo task assignment instance
	 */
	@AutoEscape
	public String getKaleoTaskName();

	/**
	 * Sets the kaleo task name of this kaleo task assignment instance.
	 *
	 * @param kaleoTaskName the kaleo task name of this kaleo task assignment instance
	 */
	public void setKaleoTaskName(String kaleoTaskName);

	/**
	 * Gets the assignee class name of this kaleo task assignment instance.
	 *
	 * @return the assignee class name of this kaleo task assignment instance
	 */
	@AutoEscape
	public String getAssigneeClassName();

	/**
	 * Sets the assignee class name of this kaleo task assignment instance.
	 *
	 * @param assigneeClassName the assignee class name of this kaleo task assignment instance
	 */
	public void setAssigneeClassName(String assigneeClassName);

	/**
	 * Gets the assignee class p k of this kaleo task assignment instance.
	 *
	 * @return the assignee class p k of this kaleo task assignment instance
	 */
	public long getAssigneeClassPK();

	/**
	 * Sets the assignee class p k of this kaleo task assignment instance.
	 *
	 * @param assigneeClassPK the assignee class p k of this kaleo task assignment instance
	 */
	public void setAssigneeClassPK(long assigneeClassPK);

	/**
	 * Gets the completed of this kaleo task assignment instance.
	 *
	 * @return the completed of this kaleo task assignment instance
	 */
	public boolean getCompleted();

	/**
	 * Determines if this kaleo task assignment instance is completed.
	 *
	 * @return <code>true</code> if this kaleo task assignment instance is completed; <code>false</code> otherwise
	 */
	public boolean isCompleted();

	/**
	 * Sets whether this kaleo task assignment instance is completed.
	 *
	 * @param completed the completed of this kaleo task assignment instance
	 */
	public void setCompleted(boolean completed);

	/**
	 * Gets the completion date of this kaleo task assignment instance.
	 *
	 * @return the completion date of this kaleo task assignment instance
	 */
	public Date getCompletionDate();

	/**
	 * Sets the completion date of this kaleo task assignment instance.
	 *
	 * @param completionDate the completion date of this kaleo task assignment instance
	 */
	public void setCompletionDate(Date completionDate);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(
		KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance);

	public int hashCode();

	public KaleoTaskAssignmentInstance toEscapedModel();

	public String toString();

	public String toXmlString();
}