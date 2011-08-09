/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.testevent;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author Shinn Lok
 */
public class EventConsumer extends GenericPortlet {

	@Override
	public void processEvent(EventRequest request, EventResponse response)
		throws PortletException, IOException {

		String value = request.getPreferences().getValue(
			EventProducer.KEY, StringPool.BLANK);

		if (Validator.isNull(value)) {
			_passedTest = true;
		}

		_runTest = false;
	}

	@Override
	public void doView(RenderRequest request, RenderResponse response)
		throws PortletException, IOException {

		PrintWriter writer = response.getWriter();

		try {
			if (_runTest) {
				writer.write("Click 'Process Event' to run test");

				return;
			}

			if (_passedTest) {
				writer.write("PASSED");
			}
			else {
				writer.write("FAILED");
			}
		}
		finally {
			writer.close();

			_runTest = true;
		}
	}

	private boolean _passedTest;
	private boolean _runTest;

}