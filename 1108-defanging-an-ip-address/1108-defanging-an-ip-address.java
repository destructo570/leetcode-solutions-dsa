class Solution {
    public String defangIPaddr(String address) {
        
//         String result = "";
        
//         for(int i=0; i<address.length(); i++){
//             if(address.charAt(i) == '.'){
//                 result = result+"[.]";
//             }else{
//                 result = result + address.charAt(i);
//             }
//         }
        
        
        // return result;
        
        return address.replace(".", "[.]");
    }
}