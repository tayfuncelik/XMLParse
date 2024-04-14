package org.example.common;

import java.text.SimpleDateFormat;

public class Const {
    public final static String EncodingType = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary";
    public final static String PasswordType = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest";
    public static final String POUND = "\u00A3";
    public static final String EURO = "\u20AC";
    public static final SimpleDateFormat DATE_TIME_FORMATTER = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    public static final String ENDPOINT="https://nodeD1.test.webservices.amadeus.com/1ASIWROORVZU";
}
