import javax.print.PrintService;
import javax.print.PrintServiceLookup;


public class PrinterService {

    public PrintService getCheckPrintService(String printerName) {
       
    	PrintService ps = null;
        PrintService[] service = PrintServiceLookup.lookupPrintServices(null,null);

        for (int i = 0; i < service.length; i++) {
            System.out.println(service[i].getName());
            if (service[i].getName().equals(printerName)) {
                ps = service[i];
            }
        }
        return ps;
    }
}
