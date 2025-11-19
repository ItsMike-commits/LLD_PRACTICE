package parkinglot.Model;

import java.sql.Date;

public class BaseModel {
    private long id;
    private Date createdAt;
    private Date lastUpdatedAt;
    

    // Getter & Setter Methods
    public long getId()
    {
        return id;
    }
    public void setId(long id)
    {
        this.id = id;
    }

    public Date getCreationTime()
    {
        return createdAt;
    }

    public void setCreationTime(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    public Date getLastUpdatedAt()
    {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt)
    {
        this.lastUpdatedAt = lastUpdatedAt; 
    }

}
