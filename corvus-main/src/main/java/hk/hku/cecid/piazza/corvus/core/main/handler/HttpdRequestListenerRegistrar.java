package hk.hku.cecid.piazza.corvus.core.main.handler;

import hk.hku.cecid.piazza.commons.spa.Extension;
import hk.hku.cecid.piazza.commons.spa.PluginException;

/**
 * HttpdRequestListenerRegistrar handles the registration of an HTTP request
 * listener with the default HTTP dispatcher context.
 * 
 * @author Hugo Y. K. Lam
 *  
 */
public class HttpdRequestListenerRegistrar extends HttpdContextRegistrar {

    /**
     * Adds an HTTP request listener to the default HTTP dispatcher context.
     * 
     * @param extension the extension which represents the listener.
     * @throws PluginException if unable to add the request listener.
     * @see hk.hku.cecid.piazza.commons.spa.ExtensionPointHandler#processExtensions(java.util.Collection)
     */
    public void processExtension(Extension extension) throws PluginException {
        String className = extension.getParameter("class");
        try {
            Class theClass = extension.getPlugin().loadClass(className);
            getHttpdContext(extension).register(
                    extension.getParameter("context"), theClass, extension.getParameters());
        }
        catch (Exception e) {
            throw new PluginException("Unable to add the request listener: "+className, e);
        }
    }
}