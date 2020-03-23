/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cex2client;

/**
 *
 * @author jihanjeeth
 */
public class CEX2Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CEX2Client csa = new CEX2Client();
        csa.execute();
    }

    private void execute() {
        System.out.println("[CLIENT] Testing Server Connection...");
        if (isConnected()) {
            System.out.println("[CLIENT] The server is connected, the test can proceed...");

            System.out.println("[CLIENT] Testing the server method getStringLength...");
            if (getLongestString("ShortString", "LongerString").equals("LongerString")) {
                System.out.println("[CLIENT] The server method getLongestString has returned the correct value");
            } else {
                System.out.println("[CLIENT][ERROR] The server method getLongestString has returned the wrong value");
            }

            System.out.println("[CLIENT] Testing the server method getLongestStringWithException...");
            try {
                if (getLongestStringWithException("ShortString", "LongerString").equals("LongerString"))
                {
                    System.out.println("[CLIENT] The server method getLongestStringWithException has returned the correct value");
                } else {
                    System.out.println("[CLIENT] The server method getLongestStringWithException has returned the wrong value");
                }
            } catch (Exception ex) 
            {
                    System.out.println("[CLIENT][ERROR] The server method getLongestStringWithException has thrown an Exception when it was NOT supposed to");
            }
                
            try {
                if (getLongestStringWithException(null, "LongerString").equals("LongerString"))
                {
                    System.out.println("[CLIENT][ERROR] The server method getLongestStringWithException has NOT thrown an Exception when it was supposed to");
                } else {
                    System.out.println("[CLIENT][ERROR] The server method getLongestStringWithException has NOT thrown an Exception when it was supposed to");
                }
            } catch (Exception ex) 
            {
                    System.out.println("[CLIENT] The server method getLongestStringWithException has thrown an Exception when it was supposed to");
            }

                        try {
                if (getLongestStringWithException("ShortString", null).equals("LongerString"))
                {
                    System.out.println("[CLIENT][ERROR] The server method getLongestStringWithException has NOT thrown an Exception when it was supposed to");
                } else {
                    System.out.println("[CLIENT][ERROR] The server method getLongestStringWithException has NOT thrown an Exception when it was supposed to");
                }
            } catch (Exception ex) 
            {
                    System.out.println("[CLIENT] The server method getLongestStringWithException has thrown an Exception when it was supposed to");
            }

                        try {
                if (getLongestStringWithException(null, null).equals("LongerString"))
                {
                    System.out.println("[CLIENT][ERROR] The server method getLongestStringWithException has NOT thrown an Exception when it was supposed to");
                } else {
                    System.out.println("[CLIENT][ERROR] The server method getLongestStringWithException has NOT thrown an Exception when it was supposed to");
                }
            } catch (Exception ex) 
            {
                    System.out.println("[CLIENT] The server method getLongestStringWithException has thrown an Exception when it was supposed to");
            }
            
            System.out.println("[CLIENT] Testing the server method addNumberToServer...");
            addNumberToServer(0.0);
            addNumberToServer(1.0);
            addNumberToServer(2.1);
            addNumberToServer(3.5);
            addNumberToServer(-10.0);

            System.out.println("[CLIENT] Testing the server method getLargestNumberInServer...");
            if(findLargestNumberInServer().equals(3.5))
                System.out.println("[CLIENT] The server method getLargestNumberInServer has returned the correct value");
            else
                System.out.println("[CLIENT][ERROR] The server method getLargestNumberInServer has returned the wrong value");


            System.out.println("[CLIENT] Testing the server method addSampleToServer...");
            Sample s1 = new Sample();
            s1.setCity("London");
            s1.setTemperature(0.2);
            s1.setHumidity(85.2);
            addSampleToServer(s1);

            System.out.println("[CLIENT] Testing the server method addSampleToServer...");
            Sample s2 = new Sample();
            s2.setCity("Rome");
            s2.setTemperature(12.2);
            s2.setHumidity(49.2);
            addSampleToServer(s2);

            System.out.println("[CLIENT] Testing the server method addSampleToServer...");
            Sample s3 = new Sample();
            s3.setCity("Dublin");
            s3.setTemperature(0.1);
            s3.setHumidity(99.9);
            addSampleToServer(s3);

            System.out.println("[CLIENT] Testing the server method addSampleToServer...");
            Sample s4 = new Sample();
            s4.setCity("Dubai");
            s4.setTemperature(30.1);
            s4.setHumidity(15.0);
            addSampleToServer(s4);

            
            System.out.println("[CLIENT] Testing the server method getSampleWithHighestTemperature...");
            if(findSampleWithHighestTemperature().getCity().equals("Dubai"))
                System.out.println("[CLIENT] The server method getStudentWithHighestGrade has returned the correct value");
            else
                System.out.println("[CLIENT][ERROR] The server method getStudentWithHighestGrade has returned the wrong value");

            
            System.out.println("[CLIENT] Testing the server method findAllSamplesWithTemperatureAbove...");
            if(findAllSamplesWithTemperatureAbove(1.0).size() == 2)
                System.out.println("[CLIENT] The server method findAllSamplesWithTemperatureAbove has returned the correct value");
            else
                System.out.println("[CLIENT][ERROR] The server method findAllSamplesWithTemperatureAbove has returned the wrong value");

            
        } else {
            System.out.println("[CLIENT] The server is NOT connected, the test has failed !");
        }

    }

    private static String getLongestStringWithException(java.lang.String s1, java.lang.String s2) {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.getLongestStringWithException(s1, s2);
    }
    private static String getLongestString(java.lang.String s1, java.lang.String s2) {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.getLongestString(s1, s2);
    }
    private static Sample findSampleWithHighestTemperature() {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.findSampleWithHighestTemperature();
    }
    private static Double findLargestNumberInServer() {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.findLargestNumberInServer();
    }
    private static java.util.List<cex2client.Sample> findAllSamplesWithTemperatureAbove(double t) {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.findAllSamplesWithTemperatureAbove(t);
    }

    private static String addSampleToServer(cex2client.Sample arg0) {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.addSampleToServer(arg0);
    }
    private static String addNumberToServer(double n) {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.addNumberToServer(n);
    }
    private static Boolean isConnected() {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.isConnected();
    }
    
}
