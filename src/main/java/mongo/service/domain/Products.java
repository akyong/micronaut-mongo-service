package mongo.service.domain;

import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonProperty;

@BsonDiscriminator
public class Products {
    @BsonCreator
    public Products(@BsonProperty("product_id") int productId,//
                    @BsonProperty("product_code") String productCode,//
                    @BsonProperty("product_name") String productName,//
                    @BsonProperty("supplier_id") int supplierId,//
                    @BsonProperty("supplier_code") String supplierCode,//
                    @BsonProperty("main_menu_id") int mainMenuId,//
                    @BsonProperty("mainmenu_name") String mainMenuName,//
                    @BsonProperty("sub_menu_id") int subMenuId,//
                    @BsonProperty("submenu_name") String subMenuName,//
                    @BsonProperty("sub_menucategory_id") int subMenuCategoryId,//
                    @BsonProperty("submenu_category_name") String subMenuCategoryName,//
                    @BsonProperty("normal_price") int normalPrice,//
                    @BsonProperty("member_price") int memberPrice,//
                    @BsonProperty("agent_commision")int agentCommision,//
                    @BsonProperty("agent_price") int agentPrice,//
                    @BsonProperty("variant_id") int variantId,//
                    @BsonProperty("variant_descriptions") String varianDescription,//
                    @BsonProperty("main_image") String mainImage,//
                    @BsonProperty("slug_url") String slugUrl,//
                    @BsonProperty("total_view_login") int totalViewLogin,//
                    @BsonProperty("total_view_non_login") int totalViewNonLogin,//
                    @BsonProperty("total_sold_product") int totalSoldProduct,//
                    @BsonProperty("mainmenu_slug") String mainMenuSlug,//
                    @BsonProperty("submenu_slug") String subMenuSlug,//
                    @BsonProperty("submenu_category_slug") String subMenuCategorySlug,//
                    @BsonProperty("total_sold_variant") int totalSoldVariant,//
                    @BsonProperty("quantity") int quantity){//
        this.productId = productId;
        this.productCode = productCode;
        this.productName = productName;
        this.supplierId = supplierId;
        this.supplierCode = supplierCode;
        this.mainMenuId = mainMenuId;
        this.mainMenuName = mainMenuName;
        this.subMenuCategoryId = subMenuCategoryId;
        this.subMenuCategoryName = subMenuCategoryName;
        this.normalPrice = normalPrice;
        this.memberPrice = memberPrice;
        this.agentCommision = agentCommision;
        this.agentPrice = agentPrice;
        this.variantId = variantId;
        this.varianDescription = varianDescription;
        this.mainImage = mainImage;
        this.slugUrl = slugUrl;
        this.totalViewLogin = totalViewLogin;
        this.totalViewNonLogin = totalViewNonLogin;
        this.totalSoldProduct = totalSoldProduct;
        this.mainMenuSlug = mainMenuSlug;
        this.subMenuCategorySlug = subMenuCategorySlug;
        this.subMenuSlug = subMenuSlug;
        this.totalSoldVariant = totalSoldVariant;
        this.quantity = quantity;
        this.subMenuId = subMenuId;
        this.subMenuName = subMenuName;
    }

    int productId;
    String productCode;
    String productName;
    int supplierId;
    String supplierCode;
    int mainMenuId;
    String mainMenuName;
    int subMenuId;
    String subMenuName;
    int subMenuCategoryId;
    String subMenuCategoryName;
    int normalPrice;
    int memberPrice;
    int agentPrice;
    int agentCommision;
    int variantId;
    String varianDescription;
    String mainImage;
    String slugUrl;
    int totalViewLogin;
    int totalViewNonLogin;
    int totalSoldProduct;
    String mainMenuSlug;
    String subMenuSlug;
    String subMenuCategorySlug;
    int totalSoldVariant;
    int quantity;

    public void setProductId(int productId) { this.productId = productId; }
    public int getProductId() { return productId; }

    public void setProductCode(String productCode) { this.productCode = productCode; }
    public String getProductCode() { return productCode; }

    public void setProductName(String productName) { this.productName = productName; }
    public String getProductName() { return productName; }

    public void setSupplierId(int supplierId) { this.supplierId = supplierId; }
    public int getSupplierId() { return supplierId; }

    public void setSupplierCode(String supplierCode) { this.supplierCode = supplierCode; }
    public String getSupplierCode() { return supplierCode; }

    public void setMainMenuId(int mainMenuId) { this.mainMenuId = mainMenuId; }
    public int getMainMenuId() { return mainMenuId; }

    public void setMainMenuName(String mainMenuName) { this.mainMenuName = mainMenuName; }
    public String getMainMenuName() { return mainMenuName; }

    public void setSubMenuId(int subMenuId) { this.subMenuId = subMenuId; }
    public int getSubMenuId() { return subMenuId; }

    public void setSubMenuName(String subMenuName) { this.subMenuName = subMenuName; }
    public String getSubMenuName() { return subMenuName; }

    public void setSubMenuCategoryId(int subMenuCategoryId) { this.subMenuCategoryId = subMenuCategoryId; }
    public int getSubMenuCategoryId() { return subMenuCategoryId; }

    public void setSubMenuCategoryName(String subMenuCategoryName) { this.subMenuCategoryName = subMenuCategoryName; }
    public String getSubMenuCategoryName() { return subMenuCategoryName; }

    public void setNormalPrice(int normalPrice) { this.normalPrice = normalPrice; }
    public int getNormalPrice() { return normalPrice; }

    public void setMemberPrice(int memberPrice) { this.memberPrice = memberPrice; }
    public int getMemberPrice() { return memberPrice; }

    public void setAgentPrice(int agentPrice) { this.agentPrice = agentPrice; }
    public int getAgentPrice() { return agentPrice; }

    public void setAgentCommision(int agentCommision) { this.agentCommision = agentCommision; }
    public int getAgentCommision() { return agentCommision; }

    public void setVariantId(int variantId) { this.variantId = variantId; }
    public int getVariantId() { return variantId; }

    public void setVarianDescription(String varianDescription) { this.varianDescription = varianDescription; }
    public String getVarianDescription() { return varianDescription; }

    public void setMainImage(String mainImage) { this.mainImage = mainImage; }
    public String getMainImage() { return mainImage; }

    public void setSlugUrl(String slugUrl) { this.slugUrl = slugUrl; }
    public String getSlugUrl() { return slugUrl; }

    public void setTotalViewLogin(int totalViewLogin) { this.totalViewLogin = totalViewLogin; }
    public int getTotalViewLogin() { return totalViewLogin; }

    public void setTotalViewNonLogin(int totalViewNonLogin) { this.totalViewNonLogin = totalViewNonLogin; }
    public int getTotalViewNonLogin() { return totalViewNonLogin; }

    public void setTotalSoldProduct(int totalSoldProduct) { this.totalSoldProduct = totalSoldProduct; }
    public int getTotalSoldProduct() { return totalSoldProduct; }

    public void setTotalSoldVariant(int totalSoldVariant) { this.totalSoldVariant = totalSoldVariant; }
    public int getTotalSoldVariant() { return totalSoldVariant; }

    public void setMainMenuSlug(String mainMenuSlug) { this.mainMenuSlug = mainMenuSlug; }
    public String getMainMenuSlug() { return mainMenuSlug; }

    public void setSubMenuSlug(String subMenuSlug) { this.subMenuSlug = subMenuSlug; }
    public String getSubMenuSlug() { return subMenuSlug; }

    public void setSubMenuCategorySlug(String subMenuCategorySlug) { this.subMenuCategorySlug = subMenuCategorySlug; }
    public String getSubMenuCategorySlug() { return subMenuCategorySlug; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
    public int getQuantity() { return quantity; }

    @Override
    public String toString() {
        try {
            return new com.fasterxml.jackson.databind.ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this);
        } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
