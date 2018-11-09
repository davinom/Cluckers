import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.client.util.store.FileDataStoreFactory;

import com.google.api.services.sheets.v4.Sheets.Spreadsheets.Values.Clear;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.BatchClearValuesRequest;
import com.google.api.services.sheets.v4.model.BatchGetValuesResponse;
import com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetRequest;
import com.google.api.services.sheets.v4.model.BatchUpdateValuesRequest;
import com.google.api.services.sheets.v4.model.BatchUpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ClearValuesRequest;
import com.google.api.services.sheets.v4.model.ClearValuesResponse;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class SheetsQuickstart {

    private static final String APPLICATION_NAME =
            "Google Sheets API Java Quickstart";

    
    private static final List<String> SCOPES1 = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
    private static final String CREDENTIALS_FILE_PATH = "/credentials.json";

    
    private static FileDataStoreFactory DATA_STORE_FACTORY;
   
    
    private static final List<String> SCOPES =
            Arrays.asList(SheetsScopes.SPREADSHEETS);

  
    private static final JsonFactory JSON_FACTORY =
            JacksonFactory.getDefaultInstance();

    private static final java.io.File DATA_STORE = new java.io.File(
            System.getProperty("user.home"), ".credentials/sheets.googleapis.com.json");
    
    private static HttpTransport HTTP_TRANSPORT;

    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    
	private static final String String = null;
	
	
	
private static Sheets service;
	    

    public static ValueRange Resp;
    public static UpdateValuesResponse Req;
static String option= null;

public void Service(Sheets service) {
    this.service = service;
}


	

    public static void main (String[] args) throws Exception {
    	@SuppressWarnings("resource")
    	Scanner console = new Scanner(System.in);	
    	
    	while (! "6".equals(option) )
    	{
    		System.out.println("Enter the number of the operation you want to utilize");
    		System.out.println("Option 1: Clear a single value");
    		System.out.println("Option 2: Add a single value");
    		System.out.println("Option 3: Add data though a whole column");
    		System.out.println("Option 4: Add data though a whole row");
    		System.out.println("Option 5: Clear a whole row");
    		System.out.println("Option 6: Clear a whole column");
    		option = console.nextLine();
    		switch (option) {
    		case "1" : Clear(); break; 
    		case "2" : Addvalue(); break;
    		case "3" : AddColumn(); break;
    		case "4" : AddRow(); break;
    		case "5" : ClearRow(); break;
    		case "6" : ClearColumn(); break;
    		}
    		break;
    	}
    
        
        final java.util.logging.Logger buggyLogger = java.util.logging.Logger.getLogger(FileDataStoreFactory.class.getName()); buggyLogger.setLevel(java.util.logging.Level.SEVERE);
       
      }
        
    

    public static void Clear () throws IOException, GeneralSecurityException
    {
    	Scanner console = new Scanner(System.in);
    	String spreadId = "1XY8Z0_L85J-rPWlbQSu65EUFo3_vV2FWg_t9Fns3XzE";
    	System.out.println("Enter a cell that you want to clear: EX: A1, B3 etc...");
        java.lang.String cell2 = console.nextLine();
    	Sheets sheetsService = createSheetsService();
        ClearValuesRequest requestBody = new ClearValuesRequest();
		Sheets.Spreadsheets.Values.Clear request =
            sheetsService.spreadsheets().values().clear(spreadId, cell2, requestBody);
            ClearValuesResponse response = request.execute();
       System.out.println(response);
    }
    
    public static void ClearRow () throws IOException, GeneralSecurityException
    {
    	Scanner console = new Scanner(System.in);
    	String spreadId = "1XY8Z0_L85J-rPWlbQSu65EUFo3_vV2FWg_t9Fns3XzE";
    	System.out.println("Enter a cell that you want to clear : EX: 1, 3 etc...");
        java.lang.String cell2 = console.nextLine();
    	Sheets sheetsService = createSheetsService();
        ClearValuesRequest requestBody = new ClearValuesRequest();
        for (int i = 1; i <10; i++)
        {
        	if (i ==1)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, "A" + cell2, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==2)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, "B" + cell2, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==3)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, "C" + cell2, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==4)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, "D" + cell2, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==5)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, "E" + cell2, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==6)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, "F" + cell2, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==7)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, "G" + cell2, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==8)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, "H" + cell2, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==9)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, "I" + cell2, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
		
        }
    }
	
    public static void ClearColumn () throws IOException, GeneralSecurityException
    {
    	Scanner console = new Scanner(System.in);
    	String spreadId = "1XY8Z0_L85J-rPWlbQSu65EUFo3_vV2FWg_t9Fns3XzE";
    	System.out.println("Enter a column that you want to clear : EX: A, B, etc...");
        java.lang.String cell2 = console.nextLine();
    	Sheets sheetsService = createSheetsService();
        ClearValuesRequest requestBody = new ClearValuesRequest();
        for (int i = 1; i <10; i++)
        {
        	if (i ==21)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, cell2 + i, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	
        	if (i ==2)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, cell2 + i, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==3)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, cell2 + i, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==4)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, cell2 + i, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==5)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, cell2 + i, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==6)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, cell2 + i, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==7)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, cell2 + i, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==8)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, cell2 + i, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
        	if (i ==9)
        	{
        		Sheets.Spreadsheets.Values.Clear request =
        	            sheetsService.spreadsheets().values().clear(spreadId, cell2 + i, requestBody);
        	            ClearValuesResponse response = request.execute();
        	       System.out.println(response);
        	}
		
        }
    }
    
    public static void Addvalue () throws IOException, GeneralSecurityException
    {
    	Scanner console = new Scanner(System.in);
    	System.out.println("Enter a cell that you want to replace: EX: A1, B3 etc...");
        String cell = console.nextLine();
        String spreadId = "1XY8Z0_L85J-rPWlbQSu65EUFo3_vV2FWg_t9Fns3XzE";
        
        SheetsQuickstart.setValue("BrowserSheet",cell,"E");
    }
    
    
    public static void AddColumn () throws IOException, GeneralSecurityException
    {
    	Scanner console = new Scanner(System.in);
    	System.out.println("Enter a cell column that you want to replace: EX: A, B etc...");
        String cell = console.nextLine();
        String spreadId = "1XY8Z0_L85J-rPWlbQSu65EUFo3_vV2FWg_t9Fns3XzE";
        
        for (int i = 1; i <10; i++)
        {
        	
        	if (i ==2)
        	{
        		 SheetsQuickstart.setValue("BrowserSheet",cell + i, "E");
        		
        	}
        	if (i ==3)
        	{
        		SheetsQuickstart.setValue("BrowserSheet",cell + i, "E");
        	}
        	if (i ==4)
        	{
        		SheetsQuickstart.setValue("BrowserSheet",cell + i, "E");
        	}
        	if (i ==5)
        	{
        		SheetsQuickstart.setValue("BrowserSheet",cell + i, "E");
        	}
        	if (i ==6)
        	{
        		SheetsQuickstart.setValue("BrowserSheet",cell + i, "E");
        	}
        	if (i ==7)
        	{
        		SheetsQuickstart.setValue("BrowserSheet",cell + i, "E");
        	}
        	if (i ==8)
        	{
        		SheetsQuickstart.setValue("BrowserSheet",cell + i, "E");
        	}
        	if (i ==9)
        	{
        		SheetsQuickstart.setValue("BrowserSheet",cell + i, "E");
        	}
        	if (i ==10)
        	{
        		SheetsQuickstart.setValue("BrowserSheet",cell + i, "E");
        	}
        }
      
    }

    public static void AddRow() throws IOException, GeneralSecurityException
    {
    	
    			
    	Scanner console = new Scanner(System.in);
    	System.out.println("Enter a cell row that you want to replace: EX: 1, 2, etc...");
       int cell = console.nextInt();
        String spreadId = "1XY8Z0_L85J-rPWlbQSu65EUFo3_vV2FWg_t9Fns3XzE";
        
        for (int i = 1; i <15; i++)
        {
        	if (i ==1)
        	{
        		 SheetsQuickstart.setValue("BrowserSheet","A"+ cell,"E");
        	}
        	if (i ==2)
        	{
        		 SheetsQuickstart.setValue("BrowserSheet","B"+ cell,"E");
        	}
        	if (i ==3)
        	{
        		 SheetsQuickstart.setValue("BrowserSheet","C"+ cell,"E");
        	}
        	if (i ==4)
        	{
        		SheetsQuickstart.setValue("BrowserSheet","D" + cell, "E");
        	}
        	if (i ==5)
        	{
        		SheetsQuickstart.setValue("BrowserSheet","E" + cell, "E");
        	}
        	if (i ==6)
        	{
        		SheetsQuickstart.setValue("BrowserSheet","F" + cell, "E");
        	}
        	if (i ==7)
        	{
        		SheetsQuickstart.setValue("BrowserSheet","G" + cell, "E");
        	}
        	if (i ==8)
        	{
        		SheetsQuickstart.setValue("BrowserSheet","H" + cell, "E");
        	}
        	if (i ==9)
        	{
        		SheetsQuickstart.setValue("BrowserSheet","I" + cell, "E");
        	}
        	if (i ==10)
        	{
        		SheetsQuickstart.setValue("BrowserSheet","J" + cell, "E");
        	}
        	if (i ==11)
        	{
        		SheetsQuickstart.setValue("BrowserSheet","K" + cell, "E");
        	}
        	if (i ==12)
        	{
        		SheetsQuickstart.setValue("BrowserSheet","L" + cell, "E");
        	}
        	if (i ==13)
        	{
        		SheetsQuickstart.setValue("BrowserSheet","M" + cell, "E");
        	}
        	if (i ==14)
        	{
        		SheetsQuickstart.setValue("BrowserSheet","N" + cell, "E");
        	}
        }
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
                        HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES1)
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

    public static ValueRange getResponse(String SheetName,String RowStart, int i, String RowEnd) throws IOException{
       
        Sheets serv = getSheetsService();


        // Prints the names and majors of students in a sample spreadsheet:
        String spreadId = "1XY8Z0_L85J-rPWlbQSu65EUFo3_vV2FWg_t9Fns3XzE";
        String range = SheetName+"!"+RowStart+ i + ":"+"Z";
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
        String range = RowStart+":"+"Z";

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
    public static void setMultipleValue(String SheetName,String RowStart, int RowStarter, String RowEnd) throws IOException, GeneralSecurityException
    {
        
        Sheets serv = getSheetsService();
        String spreadId = "1XY8Z0_L85J-rPWlbQSu65EUFo3_vV2FWg_t9Fns3XzE";
        String range = RowStart+":"+"Z";

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
    private static Credential getCredentials(final HttpTransport hTTP_TRANSPORT2) throws IOException {
        // Load client secrets.
        InputStream in = SheetsQuickstart.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                hTTP_TRANSPORT2, JSON_FACTORY, clientSecrets, SCOPES1)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receier = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receier).authorize("user");
    }

    

    public static Sheets createSheetsService() throws IOException, GeneralSecurityException {
        HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
        JsonFactory jsonFactory = JacksonFactory.getDefaultInstance();

        
		
        Credential credential = authorize();
       
        return new Sheets.Builder(httpTransport, jsonFactory, credential)
            .setApplicationName("Edit spreadsheet")
            .build();
      
      }

        

        
      

      
   
      
}




