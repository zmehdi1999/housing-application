public class Reviews {

    protected String tenantReview;
    protected String ownerReview;
    protected String propertyReview;
    protected String review;

    public Review(String review, String tenantReview, String ownerReview, String propertyReview) {
        this.review = review;
        this.tenantReview = tenantReview;
        this.ownerReview = ownerReview;
        this.propertyReview = propertyReview;
    }

    public String getTenantReview() {
        return tenantReview;
    }

    public String getOwnerReview() {
        return ownerReview;
    }

    public String getPropertyReview() {
        return propertyReview;
    }

    public void setTenantReview(String tenantReview) {
        this.tenantReview = tenantReview;
    }

    public void setOwnerReview(String ownerReview) {
        this.ownerReview = ownerReview;
    }

    public void setPropertyReview(String propertyReview) {
        this.propertyReview = propertyReview;
    }

}
