package com.oracle.pts.healthcare.load.wsclient;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation="http://localhost:7101/HealthCare/HealthCareLoadPort?WSDL",
  targetNamespace="http://healthcare.webservice.pts.oracle.com/", name="HealthCareLoadService")
public class HealthCareLoadService
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("com.oracle.pts.healthcare.load.wsclient.HealthCareLoadService");
      URL baseUrl = HealthCareLoadService.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            HealthCareLoadService.class.getResource("http://localhost:7101/HealthCare/HealthCareLoadPort?WSDL");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://localhost:7101/HealthCare/HealthCareLoadPort?WSDL");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://localhost:7101/HealthCare/HealthCareLoadPort?WSDL");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://localhost:7101/HealthCare/HealthCareLoadPort?WSDL",
          e);
    }
  }

  public HealthCareLoadService()
  {
    super(wsdlLocationURL,
          new QName("http://healthcare.webservice.pts.oracle.com/",
                    "HealthCareLoadService"));
  }

  public HealthCareLoadService(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="HealthCareLoadPort")
  public HealthCareLoad getHealthCareLoadPort()
  {
    return (HealthCareLoad) super.getPort(new QName("http://healthcare.webservice.pts.oracle.com/",
                                                    "HealthCareLoadPort"),
                                          HealthCareLoad.class);
  }

  @WebEndpoint(name="HealthCareLoadPort")
  public HealthCareLoad getHealthCareLoadPort(WebServiceFeature... features)
  {
    return (HealthCareLoad) super.getPort(new QName("http://healthcare.webservice.pts.oracle.com/",
                                                    "HealthCareLoadPort"),
                                          HealthCareLoad.class, features);
  }
}
