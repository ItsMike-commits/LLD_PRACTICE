package parkinglot.model;

import java.sql.Date;

public class BaseModel {
    private Long id;
    private Date createdAt;
    private Date lastUpdatedAt;
    

    // Getter & Setter Methods
    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
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
