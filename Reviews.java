public class Reviews {

    private String tenantReview, ownerReview, propertyReview, review;

    public Review(String review) {
        this.review = review;
    }

    public String getTenantReview() {
        return "";
    }

    public String getOwnerReview() {
        return "";
    }

    public String getPropertyReview() {
        return "";
    }

    public void setTenantReview(String newTenantReview) {
        this.tenantReview = newTenantReview;
    }

    public void setOwnerReview(String newOwnerReview) {
        this.ownerReview = newOwnerReview;
    }

    public void setPropertyReview(String newPropertyReview) {
        this.propertyReview = newPropertyReview;
    }

}