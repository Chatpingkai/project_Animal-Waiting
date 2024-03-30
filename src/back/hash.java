
package back;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author ENdDoWn
 */
public class hash {
    
    public String doHash(String p) {
        try {
            MessageDigest md;
            md = MessageDigest.getInstance("SHA-256");
            md.update(p.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1)); 
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            return null;
        }
    }
}
