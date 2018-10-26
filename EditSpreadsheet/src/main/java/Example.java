import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.Lists;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.AddConditionalFormatRuleRequest;
import com.google.api.services.sheets.v4.model.AddSheetRequest;
import com.google.api.services.sheets.v4.model.AppendValuesResponse;
import com.google.api.services.sheets.v4.model.BatchGetValuesResponse;
import com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetRequest;
import com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetResponse;
import com.google.api.services.sheets.v4.model.BatchUpdateValuesRequest;
import com.google.api.services.sheets.v4.model.BatchUpdateValuesResponse;
import com.google.api.services.sheets.v4.model.BooleanCondition;
import com.google.api.services.sheets.v4.model.BooleanRule;
import com.google.api.services.sheets.v4.model.CellData;
import com.google.api.services.sheets.v4.model.CellFormat;
import com.google.api.services.sheets.v4.model.Color;
import com.google.api.services.sheets.v4.model.ConditionValue;
import com.google.api.services.sheets.v4.model.ConditionalFormatRule;
import com.google.api.services.sheets.v4.model.ExtendedValue;
import com.google.api.services.sheets.v4.model.FindReplaceRequest;
import com.google.api.services.sheets.v4.model.FindReplaceResponse;
import com.google.api.services.sheets.v4.model.GridCoordinate;
import com.google.api.services.sheets.v4.model.GridRange;
import com.google.api.services.sheets.v4.model.PivotGroup;
import com.google.api.services.sheets.v4.model.PivotTable;
import com.google.api.services.sheets.v4.model.PivotValue;
import com.google.api.services.sheets.v4.model.Request;
import com.google.api.services.sheets.v4.model.RowData;
import com.google.api.services.sheets.v4.model.Spreadsheet;
import com.google.api.services.sheets.v4.model.SpreadsheetProperties;
import com.google.api.services.sheets.v4.model.TextFormat;
import com.google.api.services.sheets.v4.model.UpdateCellsRequest;
import com.google.api.services.sheets.v4.model.UpdateSpreadsheetPropertiesRequest;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Example {
	
	 private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
	    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
	    private static final String TOKENS_DIRECTORY_PATH = "tokens";

	    /**
	     * Global instance of the scopes required by this quickstart.
	     * If modifying these scopes, delete your previously saved tokens/ folder.
	     */
	    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS);
	    private static final String CREDENTIALS_FILE_PATH = "/credentials.json";

	    /**
	     * Creates an authorized Credential object.
	     * @param HTTP_TRANSPORT The network HTTP Transport.
	     * @return An authorized Credential object.
	     * @throws IOException If the credentials.json file cannot be found.
	     */
	    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
	        // Load client secrets.
	        InputStream in = SheetsQuickstart.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
	        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

	        // Build flow and trigger user authorization request.
	        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
	                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
	                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
	                .setAccessType("offline")
	                .build();
	        LocalServerReceiver receier = new LocalServerReceiver.Builder().setPort(8888).build();
	        return new AuthorizationCodeInstalledApp(flow, receier).authorize("user");
	    }

	    /**
	     * Prints the names and majors of students in a sample spreadsheet:
	     * https://docs.google.com/spreadsheets/d/1BxiMVs0XRA5nFMdKvBdBZjgmUUqptlbs74OgvE2upms/edit
	     */
     
    public static void main(String... args) throws IOException, GeneralSecurityException {
        // Build a new authorized API client service.
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        final String spreadsheetId = "1XY8Z0_L85J-rPWlbQSu65EUFo3_vV2FWg_t9Fns3XzE";
        final String range = "A:I";
        Scanner console = new Scanner(System.in);
        		
        System.out.println(SCOPES);
        		
         Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
        } else {
        
            for (List row : values) {
                // Print columns A and E, which correspond to indices 0 and 4.
               System.out.printf("%s, %s, %s, %s, %s, %s, %s, %s, %s\n", row.get(0), row.get(1), row.get(2), row.get(3), row.get(4), row.get(5), row.get(6), row.get(7),row.get(8));
            }

        }
    }
}
	