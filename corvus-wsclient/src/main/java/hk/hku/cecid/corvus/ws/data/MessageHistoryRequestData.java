package hk.hku.cecid.corvus.ws.data;

public class MessageHistoryRequestData extends KVPairData {
	
	
	public MessageHistoryRequestData(int maxCapacity) {
		super(maxCapacity);
	}

	public static final String [] CONFIG_KEY_SET = 
	{
		"endpoint"
	};
	
	/**
	 * For consistent, used for {@link DataFactory#createEBMSAdminDataFromXML(hk.hku.cecid.piazza.commons.util.PropertyTree)}
	 */
	public static final String [] PARAM_KEY_SET = 
	{
		"messageBox", "status"
	};
	
	public void setEndPoint(String value){
		props.put(CONFIG_KEY_SET[0], value);
	}

	public String getEndPoint(){
		return (String) props.get(CONFIG_KEY_SET[0]);
	}
	
	public void setStatus(String value){
		props.put(PARAM_KEY_SET[1], value);
	}
	
	public void setMessageBox(String value){
		props.put(PARAM_KEY_SET[0], value);
	}

	public String getStatus(){
		return (String)props.get(PARAM_KEY_SET[1]);
	}
	
	public String getMessageBox(){
		return (String)props.get(PARAM_KEY_SET[0]);
	}
}
