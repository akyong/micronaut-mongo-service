package mongo.service.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Date;

@BsonDiscriminator
public class Products {

    @BsonCreator
    public Products(
            @JsonProperty("product_id") @BsonProperty("product_id") int productId,
            @JsonProperty("product_code") @BsonProperty("product_code") String productCode,
            @JsonProperty("product_name") @BsonProperty("product_name") String productName,
            @JsonProperty("supplier_id") @BsonProperty("supplier_id") int supplierId,//
            @JsonProperty("supplier_code") @BsonProperty("supplier_code") String supplierCode,//
            @JsonProperty("main_menu_id") @BsonProperty("main_menu_id") int mainMenuId,//
            @JsonProperty("mainmenu_name") @BsonProperty("mainmenu_name") String mainMenuName,//
            @JsonProperty("sub_menu_id") @BsonProperty("sub_menu_id") int subMenuId,//
            @JsonProperty("submenu_name") @BsonProperty("submenu_name") String subMenuName,//
            @JsonProperty("sub_menucategory_id") @BsonProperty("sub_menucategory_id") int subMenuCategoryId,//
            @JsonProperty("submenu_category_name") @BsonProperty("submenu_category_name") String subMenuCategoryName,//
            @JsonProperty("normal_price") @BsonProperty("normal_price") int normalPrice,//
            @JsonProperty("member_price") @BsonProperty("member_price") int memberPrice,//
            @JsonProperty("agent_commision") @BsonProperty("agent_commision") int agentCommision,//
            @JsonProperty("agent_price") @BsonProperty("agent_price") int agentPrice,//
            @JsonProperty("variant_id") @BsonProperty("variant_id") int variantId,//
            @JsonProperty("variant_descriptions") @BsonProperty("variant_descriptions") String varianDescription,//
            @JsonProperty("main_image") @BsonProperty("main_image") String mainImage,//
            @JsonProperty("created_at") @BsonProperty("created_at") Date createdAt,//
            @JsonProperty("updated_at") @BsonProperty("updated_at") Date updatedAt,//
            @JsonProperty("slug_url") @BsonProperty("slug_url") String slugUrl,//
            @JsonProperty("total_view_login") @BsonProperty("total_view_login") int totalViewLogin,//
            @JsonProperty("total_view_non_login") @BsonProperty("total_view_non_login") int totalViewNonLogin,//
            @JsonProperty("total_sold_product") @BsonProperty("total_sold_product") int totalSoldProduct,//
            @JsonProperty("mainmenu_slug") @BsonProperty("mainmenu_slug") String mainMenuSlug,//
            @JsonProperty("submenu_slug") @BsonProperty("submenu_slug") String subMenuSlug,//
            @JsonProperty("submenu_category_slug") @BsonProperty("submenu_category_slug") String subMenuCategorySlug,//
            @JsonProperty("total_sold_variant") @BsonProperty("total_sold_variant") int totalSoldVariant,//
            @JsonProperty("quantity") @BsonProperty("quantity") int quantity
    ){
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
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    @JsonProperty("product_id") @BsonProperty("product_id") int productId;
    @JsonProperty("product_code") @BsonProperty("product_code") String productCode;
    @JsonProperty("product_name") @BsonProperty("product_name") String productName;
    @JsonProperty("supplier_id") @BsonProperty("supplier_id") int supplierId;
    @JsonProperty("supplier_code") @BsonProperty("supplier_code") String supplierCode;
    @JsonProperty("main_menu_id") @BsonProperty("main_menu_id") int mainMenuId;
    @JsonProperty("mainmenu_name") @BsonProperty("mainmenu_name") String mainMenuName;
    @JsonProperty("sub_menu_id") @BsonProperty("sub_menu_id") int subMenuId;
    @JsonProperty("submenu_name") @BsonProperty("submenu_name") String subMenuName;
    @JsonProperty("sub_menucategory_id") @BsonProperty("sub_menucategory_id") int subMenuCategoryId;
    @JsonProperty("submenu_category_name") @BsonProperty("submenu_category_name") String subMenuCategoryName;
    @JsonProperty("normal_price") @BsonProperty("normal_price") int normalPrice;
    @JsonProperty("member_price") @BsonProperty("member_price") int memberPrice;
    @JsonProperty("agent_commision") @BsonProperty("agent_commision") int agentCommision;
    @JsonProperty("agent_price") @BsonProperty("agent_price") int agentPrice;
    @JsonProperty("variant_id") @BsonProperty("variant_id") int variantId;
    @JsonProperty("variant_descriptions") @BsonProperty("variant_descriptions") String varianDescription;
    @JsonProperty("main_image") @BsonProperty("main_image") String mainImage;
    @JsonProperty("created_at") @BsonProperty("created_at") Date createdAt;
    @JsonProperty("updated_at") @BsonProperty("updated_at") Date updatedAt;
    @JsonProperty("slug_url") @BsonProperty("slug_url") String slugUrl;
    @JsonProperty("total_view_login") @BsonProperty("total_view_login") int totalViewLogin;
    @JsonProperty("total_view_non_login") @BsonProperty("total_view_non_login") int totalViewNonLogin;
    @JsonProperty("total_sold_product") @BsonProperty("total_sold_product") int totalSoldProduct;
    @JsonProperty("mainmenu_slug") @BsonProperty("mainmenu_slug") String mainMenuSlug;
    @JsonProperty("submenu_slug") @BsonProperty("submenu_slug") String subMenuSlug;
    @JsonProperty("submenu_category_slug") @BsonProperty("submenu_category_slug") String subMenuCategorySlug;
    @JsonProperty("total_sold_variant") @BsonProperty("total_sold_variant") int totalSoldVariant;
    @JsonProperty("quantity") @BsonProperty("quantity") int quantity;

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

    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
    public Date getCreatedAt() { return createdAt; }

    public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }
    public Date getUpdatedAt() { return updatedAt; }

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
