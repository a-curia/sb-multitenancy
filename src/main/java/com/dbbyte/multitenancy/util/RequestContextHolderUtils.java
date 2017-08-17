package com.dbbyte.multitenancy.util;


/**
 * setp_3 - RequestContextHolderUtil is a class which determines the tenant
 * based on a pattern contained in the Uri of the request.
 */

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.dbbyte.multitenancy.constants.CustomRequestAttributes;

public class RequestContextHolderUtils {
    
   private static final String DEFAULT_TENANT_ID = "label4Db1";

   public static final String getCurrentTenantIdentifier() {
       RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
       if (requestAttributes != null) {
            String identifier = (String) requestAttributes.getAttribute(CustomRequestAttributes.CURRENT_TENANT_IDENTIFIER,RequestAttributes.SCOPE_REQUEST);
            if (identifier != null) {
                return identifier;
            }
       }
       return DEFAULT_TENANT_ID;
   }

}
