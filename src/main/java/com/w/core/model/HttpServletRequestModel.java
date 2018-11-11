package com.w.core.model;

/**
 * create table HTTP_SERVLET_REQUEST
 * (
 *   general_request_url                       VARCHAR2(100),
 *   general_request_method                    VARCHAR2(100),
 *   general_status_code                       VARCHAR2(100),
 *   general_remote_address                    VARCHAR2(100),
 *   general_referrer_policy                   VARCHAR2(100),
 *   request_headers_accept                    VARCHAR2(100),
 *   request_headers_accept_encoding           VARCHAR2(100),
 *   request_headers_accept_language           VARCHAR2(100),
 *   request_headers_connection                VARCHAR2(100),
 *   request_headers_cookie                    VARCHAR2(100),
 *   request_headers_host                      VARCHAR2(100),
 *   request_headers_upgrade_insecure_requests VARCHAR2(100),
 *   request_headers_user_agent                VARCHAR2(100),
 *   query_string_parameters                   VARCHAR2(100),
 *   http_servlet_request_time                 VARCHAR2(100)
 * )
 */
public class HttpServletRequestModel {

    private String generalRequestUrl;

    private String generalRequestMethod;

    private String generalStatusCode;

    private String generalRemoteAddress;

    private String generalReferrerPolicy;

    private String requestHeadersAccept;

    private String requestHeadersAcceptEncoding;

    private String requestHeadersAcceptLanguage;

    private String requestHeadersConnection;

    private String requestHeadersCookie;

    private String requestHeadersHost;

    private String requestHeadersUpgradeInsecureRequests;

    private String requestHeadersUserAgent;

    private String queryStringParameters;

    private String httpServletRequestTime;

    public String getGeneralRequestUrl() {
        return generalRequestUrl;
    }

    public void setGeneralRequestUrl(String generalRequestUrl) {
        this.generalRequestUrl = generalRequestUrl;
    }

    public String getGeneralRequestMethod() {
        return generalRequestMethod;
    }

    public void setGeneralRequestMethod(String generalRequestMethod) {
        this.generalRequestMethod = generalRequestMethod;
    }

    public String getGeneralStatusCode() {
        return generalStatusCode;
    }

    public void setGeneralStatusCode(String generalStatusCode) {
        this.generalStatusCode = generalStatusCode;
    }

    public String getGeneralRemoteAddress() {
        return generalRemoteAddress;
    }

    public void setGeneralRemoteAddress(String generalRemoteAddress) {
        this.generalRemoteAddress = generalRemoteAddress;
    }

    public String getGeneralReferrerPolicy() {
        return generalReferrerPolicy;
    }

    public void setGeneralReferrerPolicy(String generalReferrerPolicy) {
        this.generalReferrerPolicy = generalReferrerPolicy;
    }

    public String getRequestHeadersAccept() {
        return requestHeadersAccept;
    }

    public void setRequestHeadersAccept(String requestHeadersAccept) {
        this.requestHeadersAccept = requestHeadersAccept;
    }

    public String getRequestHeadersAcceptEncoding() {
        return requestHeadersAcceptEncoding;
    }

    public void setRequestHeadersAcceptEncoding(String requestHeadersAcceptEncoding) {
        this.requestHeadersAcceptEncoding = requestHeadersAcceptEncoding;
    }

    public String getRequestHeadersAcceptLanguage() {
        return requestHeadersAcceptLanguage;
    }

    public void setRequestHeadersAcceptLanguage(String requestHeadersAcceptLanguage) {
        this.requestHeadersAcceptLanguage = requestHeadersAcceptLanguage;
    }

    public String getRequestHeadersConnection() {
        return requestHeadersConnection;
    }

    public void setRequestHeadersConnection(String requestHeadersConnection) {
        this.requestHeadersConnection = requestHeadersConnection;
    }

    public String getRequestHeadersCookie() {
        return requestHeadersCookie;
    }

    public void setRequestHeadersCookie(String requestHeadersCookie) {
        this.requestHeadersCookie = requestHeadersCookie;
    }

    public String getRequestHeadersHost() {
        return requestHeadersHost;
    }

    public void setRequestHeadersHost(String requestHeadersHost) {
        this.requestHeadersHost = requestHeadersHost;
    }

    public String getRequestHeadersUpgradeInsecureRequests() {
        return requestHeadersUpgradeInsecureRequests;
    }

    public void setRequestHeadersUpgradeInsecureRequests(String requestHeadersUpgradeInsecureRequests) {
        this.requestHeadersUpgradeInsecureRequests = requestHeadersUpgradeInsecureRequests;
    }

    public String getRequestHeadersUserAgent() {
        return requestHeadersUserAgent;
    }

    public void setRequestHeadersUserAgent(String requestHeadersUserAgent) {
        this.requestHeadersUserAgent = requestHeadersUserAgent;
    }

    public String getQueryStringParameters() {
        return queryStringParameters;
    }

    public void setQueryStringParameters(String queryStringParameters) {
        this.queryStringParameters = queryStringParameters;
    }

    public String getHttpServletRequestTime() {
        return httpServletRequestTime;
    }

    public void setHttpServletRequestTime(String httpServletRequestTime) {
        this.httpServletRequestTime = httpServletRequestTime;
    }
}
