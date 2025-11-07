public class ValidIPAddress {
    public String validIPAddress(String queryIP) {
        String ipv4Pattern = 
            "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
        
        if (queryIP.matches(ipv4Pattern)) return "IPv4";
        else {
            return validateIPV6(queryIP.split(":",-1));
        }
    }
    
    public static String validateIPV6(String[] parts) {

        if (parts.length != 8) return "Neither";

        for (String part : parts) {
            if (part.length() == 0 || part.length() > 4) return "Neither";
            for (char ch : part.toCharArray()) {
                if (!isHexDigit(ch)) return "Neither";
            }
        }
        return "IPv6";
    
}
    private static boolean isHexDigit(char ch) {
        return Character.isDigit(ch) || 
               (ch >= 'a' && ch <= 'f') || 
               (ch >= 'A' && ch <= 'F');
    }
        
    
}
