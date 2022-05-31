package com.example.e_commerceapp.ui.category.model


import com.google.gson.annotations.SerializedName

data class Variant(
    @SerializedName("admin_graphql_api_id")
    var adminGraphqlApiId: String,
    var barcode: Any,
    @SerializedName("compare_at_price")
    var compareAtPrice: Any,
    @SerializedName("created_at")
    var createdAt: String,
    @SerializedName("fulfillment_service")
    var fulfillmentService: String,
    var grams: Int,
    var id: Long,
    @SerializedName("image_id")
    var imageId: Any,
    @SerializedName("inventory_item_id")
    var inventoryItemId: Long,
    @SerializedName("inventory_management")
    var inventoryManagement: String,
    @SerializedName("inventory_policy")
    var inventoryPolicy: String,
    @SerializedName("inventory_quantity")
    var inventoryQuantity: Int,
    @SerializedName("old_inventory_quantity")
    var oldInventoryQuantity: Int,
    var option1: String,
    var option2: String,
    var option3: Any,
    var position: Int,
    var price: String,
    @SerializedName("product_id")
    var productId: Long,
    @SerializedName("requires_shipping")
    var requiresShipping: Boolean,
    var sku: String,
    var taxable: Boolean,
    var title: String,
    @SerializedName("updated_at")
    var updatedAt: String,
    var weight: Double,
    @SerializedName("weight_unit")
    var weightUnit: String
)