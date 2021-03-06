/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Linked service for an HTTP source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = HttpLinkedService.class)
@JsonTypeName("HttpServer")
@JsonFlatten
public class HttpLinkedService extends LinkedServiceInner {
    /**
     * The base URL of the HTTP endpoint, e.g. http://www.microsoft.com. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /**
     * The authentication type to be used to connect to the HTTP server.
     * Possible values include: 'Basic', 'Anonymous', 'Digest', 'Windows',
     * 'ClientCertificate'.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private HttpAuthenticationType authenticationType;

    /**
     * User name for Basic, Digest, or Windows authentication. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /**
     * Password for Basic, Digest, Windows, or ClientCertificate with
     * EmbeddedCertData authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * Base64 encoded certificate data for ClientCertificate authentication.
     * For on-premises copy with ClientCertificate authentication, either
     * CertThumbprint or EmbeddedCertData/Password should be specified. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.embeddedCertData")
    private Object embeddedCertData;

    /**
     * Thumbprint of certificate for ClientCertificate authentication. Only
     * valid for on-premises copy. For on-premises copy with ClientCertificate
     * authentication, either CertThumbprint or EmbeddedCertData/Password
     * should be specified. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.certThumbprint")
    private Object certThumbprint;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * If true, validate the HTTPS server SSL certificate. Default value is
     * true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.enableServerCertificateValidation")
    private Object enableServerCertificateValidation;

    /**
     * Get the base URL of the HTTP endpoint, e.g. http://www.microsoft.com. Type: string (or Expression with resultType string).
     *
     * @return the url value
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the base URL of the HTTP endpoint, e.g. http://www.microsoft.com. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set
     * @return the HttpLinkedService object itself.
     */
    public HttpLinkedService withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the authentication type to be used to connect to the HTTP server. Possible values include: 'Basic', 'Anonymous', 'Digest', 'Windows', 'ClientCertificate'.
     *
     * @return the authenticationType value
     */
    public HttpAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authentication type to be used to connect to the HTTP server. Possible values include: 'Basic', 'Anonymous', 'Digest', 'Windows', 'ClientCertificate'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the HttpLinkedService object itself.
     */
    public HttpLinkedService withAuthenticationType(HttpAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get user name for Basic, Digest, or Windows authentication. Type: string (or Expression with resultType string).
     *
     * @return the userName value
     */
    public Object userName() {
        return this.userName;
    }

    /**
     * Set user name for Basic, Digest, or Windows authentication. Type: string (or Expression with resultType string).
     *
     * @param userName the userName value to set
     * @return the HttpLinkedService object itself.
     */
    public HttpLinkedService withUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData authentication.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData authentication.
     *
     * @param password the password value to set
     * @return the HttpLinkedService object itself.
     */
    public HttpLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get base64 encoded certificate data for ClientCertificate authentication. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     *
     * @return the embeddedCertData value
     */
    public Object embeddedCertData() {
        return this.embeddedCertData;
    }

    /**
     * Set base64 encoded certificate data for ClientCertificate authentication. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     *
     * @param embeddedCertData the embeddedCertData value to set
     * @return the HttpLinkedService object itself.
     */
    public HttpLinkedService withEmbeddedCertData(Object embeddedCertData) {
        this.embeddedCertData = embeddedCertData;
        return this;
    }

    /**
     * Get thumbprint of certificate for ClientCertificate authentication. Only valid for on-premises copy. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     *
     * @return the certThumbprint value
     */
    public Object certThumbprint() {
        return this.certThumbprint;
    }

    /**
     * Set thumbprint of certificate for ClientCertificate authentication. Only valid for on-premises copy. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     *
     * @param certThumbprint the certThumbprint value to set
     * @return the HttpLinkedService object itself.
     */
    public HttpLinkedService withCertThumbprint(Object certThumbprint) {
        this.certThumbprint = certThumbprint;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the HttpLinkedService object itself.
     */
    public HttpLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get if true, validate the HTTPS server SSL certificate. Default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableServerCertificateValidation value
     */
    public Object enableServerCertificateValidation() {
        return this.enableServerCertificateValidation;
    }

    /**
     * Set if true, validate the HTTPS server SSL certificate. Default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param enableServerCertificateValidation the enableServerCertificateValidation value to set
     * @return the HttpLinkedService object itself.
     */
    public HttpLinkedService withEnableServerCertificateValidation(Object enableServerCertificateValidation) {
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        return this;
    }

}
