/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.resources.models.GenericResource;
import com.microsoft.azure.management.resources.models.GenericResourceFilter;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.management.resources.models.ResourcesMoveInfo;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.lang.InterruptedException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.HEAD;
import retrofit.http.Header;
import retrofit.http.HTTP;
import retrofit.http.Path;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in ResourcesOperations.
 */
public interface ResourcesOperations {
    /**
     * The interface defining all the services for ResourcesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ResourcesService {
        @POST("/subscriptions/{subscriptionId}/resourceGroups/{sourceResourceGroupName}/moveResources")
        Call<ResponseBody> moveResources(@Path("sourceResourceGroupName") String sourceResourceGroupName, @Path("subscriptionId") String subscriptionId, @Body ResourcesMoveInfo parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resources")
        Call<ResponseBody> list(@Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("$top") Integer top, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @HEAD("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePath}/{resourceType}/{resourceName}")
        Call<Void> checkExistence(@Path("resourceGroupName") String resourceGroupName, @Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("parentResourcePath") String parentResourcePath, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePath}/{resourceType}/{resourceName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("parentResourcePath") String parentResourcePath, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PUT("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePath}/{resourceType}/{resourceName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("parentResourcePath") String parentResourcePath, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Body GenericResource parameters, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePath}/{resourceType}/{resourceName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("parentResourcePath") String parentResourcePath, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Begin moving resources.To determine whether the operation has finished processing the request, call GetLongRunningOperationStatus.
     *
     * @param sourceResourceGroupName Source resource group name.
     * @param parameters move resources' parameters.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> moveResources(String sourceResourceGroupName, ResourcesMoveInfo parameters) throws ServiceException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Begin moving resources.To determine whether the operation has finished processing the request, call GetLongRunningOperationStatus.
     *
     * @param sourceResourceGroupName Source resource group name.
     * @param parameters move resources' parameters.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> moveResourcesAsync(String sourceResourceGroupName, ResourcesMoveInfo parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * Get all of the resources under a subscription.
     *
     * @param filter The filter to apply on the operation.
     * @param top Query parameters. If null is passed returns all resource groups.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;GenericResource&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<GenericResource>> list(GenericResourceFilter filter, Integer top) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get all of the resources under a subscription.
     *
     * @param filter The filter to apply on the operation.
     * @param top Query parameters. If null is passed returns all resource groups.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(GenericResourceFilter filter, Integer top, final ServiceCallback<PageImpl<GenericResource>> serviceCallback);

    /**
     * Checks whether resource exists.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param apiVersion the String value
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Boolean object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Boolean> checkExistence(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Checks whether resource exists.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param apiVersion the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> checkExistenceAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion, final ServiceCallback<Boolean> serviceCallback);

    /**
     * Delete resource and all of its resources. 
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param apiVersion the String value
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Delete resource and all of its resources. 
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param apiVersion the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion, final ServiceCallback<Void> serviceCallback);

    /**
     * Create a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param apiVersion the String value
     * @param parameters Create or update resource parameters.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the GenericResource object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<GenericResource> createOrUpdate(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion, GenericResource parameters) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Create a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param apiVersion the String value
     * @param parameters Create or update resource parameters.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion, GenericResource parameters, final ServiceCallback<GenericResource> serviceCallback);

    /**
     * Returns a resource belonging to a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param apiVersion the String value
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the GenericResource object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<GenericResource> get(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Returns a resource belonging to a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param apiVersion the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion, final ServiceCallback<GenericResource> serviceCallback);

    /**
     * Get all of the resources under a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;GenericResource&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<GenericResource>> listNext(String nextPageLink) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get all of the resources under a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<GenericResource>> serviceCallback);

}
