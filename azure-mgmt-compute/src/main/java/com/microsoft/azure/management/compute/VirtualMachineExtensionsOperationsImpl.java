/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.compute.models.VirtualMachineExtension;
import com.microsoft.rest.AzureServiceResponseBuilder;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.serializer.AzureJacksonUtils;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.lang.InterruptedException;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class VirtualMachineExtensionsOperationsImpl implements VirtualMachineExtensionsOperations {
    private VirtualMachineExtensionsService service;
    ComputeManagementClient client;

    public VirtualMachineExtensionsOperationsImpl(Retrofit retrofit, ComputeManagementClient client) {
        this.service = retrofit.create(VirtualMachineExtensionsService.class);
        this.client = client;
    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualMachineExtension object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<VirtualMachineExtension> createOrUpdate(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtension extensionParameters) throws ServiceException, IOException, IllegalArgumentException, InterruptedException {
        Response<ResponseBody> result = service.createOrUpdate(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), extensionParameters, this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<VirtualMachineExtension>() {}.getType());
    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtension extensionParameters, final ServiceCallback<VirtualMachineExtension> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.")));
        }
        if (vmName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter vmName is required and cannot be null.")));
        }
        if (vmExtensionName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.")));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.")));
        }
        if (extensionParameters == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter extensionParameters is required and cannot be null.")));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
        }
        Validator.validate(extensionParameters, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdate(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), extensionParameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, new TypeToken<VirtualMachineExtension>() {}.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> delete(String resourceGroupName, String vmName, String vmExtensionName) throws ServiceException, IOException, IllegalArgumentException, InterruptedException {
        Response<ResponseBody> result = service.delete(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() {}.getType());
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> deleteAsync(String resourceGroupName, String vmName, String vmExtensionName, final ServiceCallback<Void> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.")));
        }
        if (vmName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter vmName is required and cannot be null.")));
        }
        if (vmExtensionName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.")));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.")));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.delete(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<Void>() {}.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param expand The expand expression to apply on the operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineExtension object if successful.
     */
    public ServiceResponse<VirtualMachineExtension> get(String resourceGroupName, String vmName, String vmExtensionName, String expand) throws ServiceException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmName == null) {
            throw new IllegalArgumentException("Parameter vmName is required and cannot be null.");
        }
        if (vmExtensionName == null) {
            throw new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.get(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), expand, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDelegate(call.execute(), null);
    }

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param expand The expand expression to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getAsync(String resourceGroupName, String vmName, String vmExtensionName, String expand, final ServiceCallback<VirtualMachineExtension> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (vmName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmName is required and cannot be null."));
            return null;
        }
        if (vmExtensionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null."));
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
        Call<ResponseBody> call = service.get(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), expand, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<VirtualMachineExtension>(serviceCallback) {
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

    private ServiceResponse<VirtualMachineExtension> getDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<VirtualMachineExtension>(new AzureJacksonUtils())
                .register(200, new TypeToken<VirtualMachineExtension>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

}
