/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.eci.secureapp;

/**
 *
 * @author DavidRivera
 */
public class SecureUrlReader {
    // Create a file and a password representation
    File trustStoreFile = new File("keystores/myTrustStore");
    char[] trustStorePassword = "567890".toCharArray();
    // Load the trust store, the default type is "pkcs12", the alternative is "jks"
    KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
    trustStore.load(new FileInputStream(trustStoreFile), trustStorePassword);
    // Get the singleton instance of the TrustManagerFactory
    TrustManagerFactory tmf = TrustManagerFactory
    .getInstance(TrustManagerFactory.getDefaultAlgorithm());

    // Itit the TrustManagerFactory using the truststore object
    tmf.init(trustStore);

}
