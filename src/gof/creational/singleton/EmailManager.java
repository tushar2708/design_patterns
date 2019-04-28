package gof.creational.singleton;

public class EmailManager {
    private static EmailManager ourInstance = null;

    private String fromEmail;
    private String[] toEmails;

    private EmailManager() { }

    /* Lazy initialization, as initializaton requires the configuration file to be already loaded,
      and there is a chance that this singleton is never used if email alerts are disabled.
     */
    public static synchronized EmailManager getInstance() {
        if (ourInstance == null){
            ourInstance = new EmailManager();
            
            // Read parameters from the system's config file.
            ourInstance.fromEmail = systemConfig.readFromConfig("fromEmail");
            ourInstance.toEmails = systemConfig.readFromConfig("toEmails");
        }
        return ourInstance;
    }

    public void synchronized SendAlertEmails(Boolean success, String error, String message){

        String emailContent = "";

        if (success) {
            emailContent = "Error: " + error + "\nMessage: " + message;
        } else {
            emailContent = "Success\nMessage: " + message;
        }

        // Calling "MailingSDK"'s static method "SendEmail()"
        MailingSDK.SendEmail(ourInstance.fromEmail, ourInstance.toEmails, emailContent)
    }
}
