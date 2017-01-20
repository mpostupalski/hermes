package hk.hku.cecid.corvus.ws.data;

/**
 * The <code>EBMSStatusQueryData</code> is the data structure
 * representing the request parameter set for EBMS Status Query
 * web services.<br/><br/>
 * 
 * This is the sample WSDL request for the status query WS request. 
 * <PRE>
 * &lt;messageId&gt; 20070418-124233-75006@147.8.177.42 &lt;/messageId&gt;  
 * </PRE>    
 * Creation Date: 10/05/2007
 * 
 * @author Twinsen Tsang
 * @version 1.0.0
 * @since	Dwarf 10327
 */
public class EBMSStatusQueryData extends CorvusStatusQueryData
{
	/**
	 * This is the configuration prefix for serialization / de-serialization.<br/><br/>
	 */
	public static final String CONFIG_PREFIX = "ebms-status-request/config";
	
	/**
	 * This is the param prefix for serialzation / de-serialization.<br/><br/>
	 */
	public static final String PARAM_PREFIX  = "ebms-status-request/param";
	
	/** 
	 * Default Constructor.
	 */
	public EBMSStatusQueryData(){
		super(CONFIG_PREFIX, PARAM_PREFIX);
	}
}
