package org.keycloak.social.weixin.mock;

import org.keycloak.http.FormPartValue;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;
import java.security.cert.X509Certificate;

public class MockedHttpRequest implements org.keycloak.http.HttpRequest {
    @Override
    public String getHttpMethod() {
        return null;
    }

    @Override
    public MultivaluedMap<String, String> getDecodedFormParameters() {
        return null;
    }

    @Override
    public MultivaluedMap<String, FormPartValue> getMultiPartFormParameters() {
        return null;
    }

    @Override
    public HttpHeaders getHttpHeaders() {
        MockedHttpHeaders headers =  new MockedHttpHeaders();

        return headers;
    }

    @Override
    public X509Certificate[] getClientCertificateChain() {
        return new X509Certificate[0];
    }

    @Override
    public UriInfo getUri() {
        return null;
    }
}
