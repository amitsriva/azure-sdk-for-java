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

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.resources.models.DeploymentOperation;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.rest.AzureServiceResponseBuilder;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.serializer.AzureJacksonUtils;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

public class DeploymentOperationsOperationsImpl implements DeploymentOperationsOperations {
    private DeploymentOperationsService service;
    ResourceManagementClient client;

    public DeploymentOperationsOperationsImpl(Retrofit retrofit, ResourceManagementClient client) {
        this.service = retrofit.create(DeploymentOperationsService.class);
        this.client = client;
    }

    /**
     * Get a list of deployments operations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId Operation Id.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeploymentOperation object if successful.
     */
    public ServiceResponse<DeploymentOperation> get(String resourceGroupName, String deploymentName, String operationId) throws ServiceException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (deploymentName == null) {
            throw new IllegalArgumentException("Parameter deploymentName is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.get(resourceGroupName, deploymentName, operationId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDelegate(call.execute(), null);
    }

    /**
     * Get a list of deployments operations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId Operation Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getAsync(String resourceGroupName, String deploymentName, String operationId, final ServiceCallback<DeploymentOperation> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (deploymentName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter deploymentName is required and cannot be null."));
            return null;
        }
        if (operationId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.get(resourceGroupName, deploymentName, operationId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<DeploymentOperation>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DeploymentOperation> getDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<DeploymentOperation>(new AzureJacksonUtils())
                .register(200, new TypeToken<DeploymentOperation>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Gets a list of deployments operations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param top Query parameters.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;DeploymentOperation&gt; object if successful.
     */
    public ServiceResponse<PageImpl<DeploymentOperation>> list(String resourceGroupName, String deploymentName, Integer top) throws ServiceException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (deploymentName == null) {
            throw new IllegalArgumentException("Parameter deploymentName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.list(resourceGroupName, deploymentName, this.client.getSubscriptionId(), top, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listDelegate(call.execute(), null);
    }

    /**
     * Gets a list of deployments operations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param top Query parameters.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listAsync(String resourceGroupName, String deploymentName, Integer top, final ServiceCallback<PageImpl<DeploymentOperation>> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (deploymentName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter deploymentName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.list(resourceGroupName, deploymentName, this.client.getSubscriptionId(), top, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<DeploymentOperation>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<DeploymentOperation>> listDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<DeploymentOperation>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<DeploymentOperation>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Gets a list of deployments operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;DeploymentOperation&gt; object if successful.
     */
    public ServiceResponse<PageImpl<DeploymentOperation>> listNext(String nextPageLink) throws ServiceException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        return listNextDelegate(call.execute(), null);
    }

    /**
     * Gets a list of deployments operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<DeploymentOperation>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<DeploymentOperation>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listNextDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<DeploymentOperation>> listNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<DeploymentOperation>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<DeploymentOperation>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

}
