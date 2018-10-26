import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;

import com.google.api.services.sheets.v4.model.BatchUpdateValuesRequest;
import com.google.api.services.sheets.v4.model.BatchUpdateValuesResponse;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
public class SheetsQuickstart {

    private static final String APPLICATION_NAME =
            "Google Sheets API Java Quickstart";

    
   

    
    private static FileDataStoreFactory DATA_STORE_FACTORY;
   
    
    private static final List<String> SCOPES =
            Arrays.asList(SheetsScopes.SPREADSHEETS);

  
    private static final JsonFactory JSON_FACTORY =
            JacksonFactory.getDefaultInstance();

    private static final java.io.File DATA_STORE = new java.io.File(
            System.getProperty("user.home"), ".credentials/sheets.googleapis.com.json");
    
    private static HttpTransport HTTP_TRANSPORT;

   
    
	private static final String String = null;

    public static ValueRange Resp;
    public static UpdateValuesResponse Req;

    public static void main (String[] args) throws Exception {
    	@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);	
        
        final java.util.logging.Logger buggyLogger = java.util.logging.Logger.getLogger(FileDataStoreFactory.class.getName()); buggyLogger.setLevel(java.util.logging.Level.SEVERE);
       
      
        System.out.println("Enter a cell that you want to replace: EX: A1, B3 etc...");
       String cell = console.nextLine();
       
       
       
        SheetsQuickstart.setValue("BrowserSheet",cell,"E");
        
        
    }

    static {
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE);
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }

    
    public static Credential authorize() throws IOException {
        // client secrets.
        InputStream in =
                SheetsQuickstart.class.getResourceAsStream("/credentials.json");
        GoogleClientSecrets clientSecrets =
                GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        
        GoogleAuthorizationCodeFlow flow =
                new GoogleAuthorizationCodeFlow.Builder(
                        HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                        .setDataStoreFactory(DATA_STORE_FACTORY)
                        .setAccessType("offline")
                        .build();
        Credential credential = new AuthorizationCodeInstalledApp(
                flow, new LocalServerReceiver()).authorize("user");
        System.out.println(
                "Credentials saved to " + DATA_STORE.getAbsolutePath());
        return credential;
    }
public static String cell()
{
	System.out.println("Enter info you want to put into cell");
	Scanner console= new Scanner(System.in);
	String cellname = console.nextLine();
	return cellname;
}

    public static Sheets getSheetsService() throws IOException {
        Credential credential = authorize();
        return new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }

    public static ValueRange getResponse(String SheetName,String RowStart, String RowEnd) throws IOException{
       
        Sheets serv = getSheetsService();


        // Prints the names and majors of students in a sample spreadsheet:
        String spreadId = "1XY8Z0_L85J-rPWlbQSu65EUFo3_vV2FWg_t9Fns3XzE";
        String range = SheetName+"!"+RowStart+":"+RowEnd;
        Resp = serv.spreadsheets().values()
                .get(spreadId, range).execute ();

        return Resp;

    }
    
    public static List<List<Object>> getData (String cell)  {

        String cellname = cell();
     	List<Object> data1 = new ArrayList<Object>();
         data1.add (cellname);

         List<List<Object>> data = new ArrayList<List<Object>>();
         data.add (data1);

         return data;
     }

    public static void setValue(String SheetName,String RowStart, String RowEnd) throws IOException, GeneralSecurityException
    {
        
        Sheets serv = getSheetsService();
        String spreadId = "1XY8Z0_L85J-rPWlbQSu65EUFo3_vV2FWg_t9Fns3XzE";
        String range = RowStart+":"+RowEnd;

        List<List<Object>> arrData = getData(String);

        ValueRange oRange = new ValueRange();
        oRange.setRange(range); 
        oRange.setValues(arrData);

        List<ValueRange> oList = new ArrayList<>();
        oList.add(oRange);

        BatchUpdateValuesRequest oRequest = new BatchUpdateValuesRequest();
        oRequest.setValueInputOption("RAW");
        oRequest.setData(oList);

        BatchUpdateValuesResponse oResp1 = serv.spreadsheets().values().batchUpdate(spreadId, oRequest).execute();

      
    }
    
  



        

        

        
      

      public static Sheets createSheetsService() throws IOException, GeneralSecurityException {
        HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
        JsonFactory jsonFactory = JacksonFactory.getDefaultInstance();

      
        GoogleCredential credential = null;

        return new Sheets.Builder(httpTransport, jsonFactory, credential)
            .setApplicationName("Google-SheetsSample/0.1")
            .build();
      
    
      }

   
      
}




