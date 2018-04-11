package com.upyoo.cloud.common.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * A utility class that contains all a "page" of data that is viewable
 * <br>
 * this list may or may not contain the entire list of information. 
 * generally this list contains a subset of data. 
 * <br>
 * ex. say we have a list of 5000 users. the entire list does not need to be 
 * returned to only display the first 15 items, the user is only going to see 
 * the first 15 both the user and the application the user will want to know 
 * that there are 5000 users in the system.
 * <br> 
 * 
 */
public class PageList<T> extends ArrayList<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	private int          totalSize = 0;
    private boolean      isUnbounded;   // Is the total size of the list known?
    private Serializable metaData;

    public PageList() {
        super();
        this.isUnbounded = false;
    }

    public PageList(Collection<T> c, int totalSize) {
        super(c);
        this.totalSize   = totalSize;
        this.isUnbounded = false;
    }
    
    public String toString() {
        StringBuffer s = new StringBuffer("{")
            .append("totalSize=")
            .append(totalSize).append(" ")
            .append("}");
        return super.toString() + s.toString();

    }
    
    
    /** returns the total size of the "masterlist" that this page is a 
     *  subset of.
     * @return Value of property listSize.
     */
    public int getTotalSize() {
        return Math.max(this.size(), this.totalSize);
    }
    
    /** Sets the total size of the "masterlist" that this page is a subset of.
     * @param totalSize New value of property totalSize.
     *
     */
    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public void setMetaData(Serializable metaData){
        this.metaData = metaData;
    }

    public Serializable getMetaData(){
        return this.metaData;
    }

    public boolean isUnbounded(){
        return this.isUnbounded;
    }

    public void setUnbounded(boolean isUnbounded){
        this.isUnbounded = isUnbounded;
    }
}
