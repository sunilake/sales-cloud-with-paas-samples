package com.oracle.ptsdemo.healthcare.wsclient.healthcare;

import java.net.URL;

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

@WebServiceClient(wsdlLocation="https://jcs.my-oraclecloudapps.com/HealthCare/HealthCarePort?WSDL",
  targetNamespace="http://ws.healthcare.ptsdemo.oracle.com/", name="HealthCareService")
public class HealthCareService
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
//  static
//  {
//    try
//    {
//      logger = Logger.getLogger("com.oracle.ptsdemo.healthcare.wsclient.healthcare.HealthCareService");
//      URL baseUrl = HealthCareService.class.getResource(".");
//      if (baseUrl == null)
//      {
//        wsdlLocationURL =
//            HealthCareService.class.getResource("https://jcs.my-oraclecloudapps.com/HealthCare/HealthCarePort?WSDL");
//        if (wsdlLocationURL == null)
//        {
//          baseUrl = new File(".").toURL();
//          wsdlLocationURL =
//              new URL(baseUrl, "https://jcs.my-oraclecloudapps.com/HealthCare/HealthCarePort?WSDL");
//        }
//      }
//      else
//      {
//                if (!baseUrl.getPath().endsWith("/")) {
//         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
//}
//                wsdlLocationURL =
//            new URL(baseUrl, "https://jcs.my-oraclecloudapps.com/HealthCare/HealthCarePort?WSDL");
//      }
//    }
//    catch (MalformedURLException e)
//    {
//      logger.log(Level.ALL,
//          "Failed to create wsdlLocationURL using https://jcs.my-oraclecloudapps.com/HealthCare/HealthCarePort?WSDL",
//          e);
//    }
//  }

  public HealthCareService()
  {
    super(wsdlLocationURL,
          new QName("http://ws.healthcare.ptsdemo.oracle.com/",
                    "HealthCareService"));
  }

  public HealthCareService(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="HealthCarePort")
  public com.oracle.ptsdemo.healthcare.wsclient.healthcare.HealthCare getHealthCarePort()
  {
    return (com.oracle.ptsdemo.healthcare.wsclient.healthcare.HealthCare) super.getPort(new QName("http://ws.healthcare.ptsdemo.oracle.com/",
                                                                                                  "HealthCarePort"),
                                                                                        com.oracle.ptsdemo.healthcare.wsclient.healthcare.HealthCare.class);
  }

  @WebEndpoint(name="HealthCarePort")
  public com.oracle.ptsdemo.healthcare.wsclient.healthcare.HealthCare getHealthCarePort(WebServiceFeature... features)
  {
    return (com.oracle.ptsdemo.healthcare.wsclient.healthcare.HealthCare) super.getPort(new QName("http://ws.healthcare.ptsdemo.oracle.com/",
                                                                                                  "HealthCarePort"),
                                                                                        com.oracle.ptsdemo.healthcare.wsclient.healthcare.HealthCare.class,
                                                                                        features);
  }
}
