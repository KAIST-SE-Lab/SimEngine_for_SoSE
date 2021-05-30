package kr.ac.kaist.se.model.abst.comm;

import kr.ac.kaist.se.model.simmodel.data.DataVar;

import java.util.ArrayList;

/**
 * An abstract class to specify a message for communication
 * @author ymbaek
 */
public abstract class _SimMessage_ {

    protected String id;            //id of a message
    protected String tag;           //tag of a message
    protected EnumMsgType msgType;  //type of a message

    protected String senderId;      //id of a sender entity/object
    protected String receiverId;    //id of a receiver entity/object

    protected ArrayList<DataVar> dataList = new ArrayList<>();  //list of data to be sent via this message


    /* GETTERS & SETTERS */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public EnumMsgType getMsgType() {
        return msgType;
    }

    public void setMsgType(EnumMsgType msgType) {
        this.msgType = msgType;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public ArrayList<DataVar> getDataList() {
        return dataList;
    }

    public void setDataList(ArrayList<DataVar> dataList) {
        this.dataList = dataList;
    }
}
