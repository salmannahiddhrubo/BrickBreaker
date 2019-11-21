
package callbackmain;


public class CallbackMain {

    
    public static void main(String[] args) {
       downloadImage(new OnDownloadProgressListener() {
           @Override
           public void OnDownloadFinished() {
                
             System.out.println("Download Completed");
           }
       });
        
    }
     public static void downloadImage(OnDownloadProgressListener listener){
        
        System.out.println("download started...");
        
        listener.OnDownloadFinished();
    }
        
        
     
    }
   
    

