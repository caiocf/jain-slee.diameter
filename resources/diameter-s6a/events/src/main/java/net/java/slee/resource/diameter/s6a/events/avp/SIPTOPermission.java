/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package net.java.slee.resource.diameter.s6a.events.avp;

import net.java.slee.resource.diameter.base.events.avp.Enumerated;

import java.io.Serializable;

/**
 * Java class representing the SIPTO-Permission enumerated type.
 * From the Diameter S6a Reference Point Protocol Details (3GPP TS 29.272 V12.8.0) specification:
 * 
 * <pre>
 * 7.3.135 SIPTO-Permission
 *
 * The SIPTO-Permission AVP is of type Enumerated. It shall indicate whether the traffic associated with this particular
 * APN is allowed or not for SIPTO above RAN.
 *
 * The following values are defined:
 *      SIPTO_above_RAN _ALLOWED (0)
 *      SIPTO_above_RAN _NOTALLOWED (1)
 * </pre>
 * 
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
public class SIPTOPermission implements Enumerated, Serializable {

  private static final long serialVersionUID = 1L;

  public static final int _SIPTO_ABOVE_RAN_ALLOWED = 0;
  public static final int _SIPTO_ABOVE_RAN_NOT_ALLOWED = 1;

  public static final SIPTOPermission SIPTO_ABOVE_RAN_ALLOWED     = new SIPTOPermission(_SIPTO_ABOVE_RAN_ALLOWED);
  public static final SIPTOPermission SIPTO_ABOVE_RAN_NOT_ALLOWED = new SIPTOPermission(_SIPTO_ABOVE_RAN_NOT_ALLOWED);

  private int value = -1;

  private SIPTOPermission(int value) {
    this.value = value;
  }

  public static SIPTOPermission fromInt(int type) {
    switch (type) {
      case _SIPTO_ABOVE_RAN_ALLOWED:
        return SIPTO_ABOVE_RAN_ALLOWED;
      case _SIPTO_ABOVE_RAN_NOT_ALLOWED:
        return SIPTO_ABOVE_RAN_NOT_ALLOWED;
      default:
        throw new IllegalArgumentException("Invalid value: " + type);
    }
  }

  public int getValue() {
    return value;
  }

  @Override
  public String toString() {
    switch (value) {
      case _SIPTO_ABOVE_RAN_ALLOWED:
        return "SIPTO_above_RAN_ALLOWED";
      case _SIPTO_ABOVE_RAN_NOT_ALLOWED:
        return "SIPTO_above_RAN_NOT_ALLOWED";
      default:
        return "<Invalid Value>";
    }
  }
}