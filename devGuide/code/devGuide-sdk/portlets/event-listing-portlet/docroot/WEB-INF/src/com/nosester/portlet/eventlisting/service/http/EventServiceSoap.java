/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.nosester.portlet.eventlisting.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.nosester.portlet.eventlisting.service.EventServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.nosester.portlet.eventlisting.service.EventServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.nosester.portlet.eventlisting.model.EventSoap}.
 * If the method in the service utility returns a
 * {@link com.nosester.portlet.eventlisting.model.Event}, that is translated to a
 * {@link com.nosester.portlet.eventlisting.model.EventSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at
 * http://localhost:8080/api/secure/axis. Set the property
 * <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author    Joe Bloggs
 * @see       EventServiceHttp
 * @see       com.nosester.portlet.eventlisting.model.EventSoap
 * @see       com.nosester.portlet.eventlisting.service.EventServiceUtil
 * @generated
 */
public class EventServiceSoap {
	public static com.nosester.portlet.eventlisting.model.EventSoap addEvent(
		com.nosester.portlet.eventlisting.model.EventSoap event)
		throws RemoteException {
		try {
			com.nosester.portlet.eventlisting.model.Event returnValue = EventServiceUtil.addEvent(com.nosester.portlet.eventlisting.model.impl.EventModelImpl.toModel(
						event));

			return com.nosester.portlet.eventlisting.model.EventSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.nosester.portlet.eventlisting.model.EventSoap addEvent(
		java.lang.String name, java.lang.String description,
		java.util.Date date, long locationId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.nosester.portlet.eventlisting.model.Event returnValue = EventServiceUtil.addEvent(name,
					description, date, locationId, serviceContext);

			return com.nosester.portlet.eventlisting.model.EventSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.nosester.portlet.eventlisting.model.EventSoap update(
		com.nosester.portlet.eventlisting.model.EventSoap event)
		throws RemoteException {
		try {
			com.nosester.portlet.eventlisting.model.Event returnValue = EventServiceUtil.update(com.nosester.portlet.eventlisting.model.impl.EventModelImpl.toModel(
						event));

			return com.nosester.portlet.eventlisting.model.EventSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.nosester.portlet.eventlisting.model.EventSoap updateEvent(
		long eventId, java.lang.String name, java.lang.String description,
		java.util.Date date, long locationId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.nosester.portlet.eventlisting.model.Event returnValue = EventServiceUtil.updateEvent(eventId,
					name, description, date, locationId, serviceContext);

			return com.nosester.portlet.eventlisting.model.EventSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.nosester.portlet.eventlisting.model.EventSoap delete(
		com.nosester.portlet.eventlisting.model.EventSoap event)
		throws RemoteException {
		try {
			com.nosester.portlet.eventlisting.model.Event returnValue = EventServiceUtil.delete(com.nosester.portlet.eventlisting.model.impl.EventModelImpl.toModel(
						event));

			return com.nosester.portlet.eventlisting.model.EventSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.nosester.portlet.eventlisting.model.EventSoap deleteEvent(
		long eventId) throws RemoteException {
		try {
			com.nosester.portlet.eventlisting.model.Event returnValue = EventServiceUtil.deleteEvent(eventId);

			return com.nosester.portlet.eventlisting.model.EventSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(EventServiceSoap.class);
}