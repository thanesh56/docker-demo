# docker-demo

### For building image
```
   docker build -t spring-docker-demo:1.0.1 .
```

### To access local container to minikube 
```
    eval $(minikube docker-env)
```

### To remove access local container to minikube
```
    eval $(minikube docker-env --unset)
```

### For loading image in minikube 
```
    minikube image load spring-docker-demo:1.0.1
```

### Create namespace 
```
    kubectl create namespace spring-docker-demo
```

### Command to run image as deployment  
```
    kubectl apply -f springboot-k8s-deployment.yaml -n spring-docker-demo
```

### Command to get all deployment in namespace 
```
    kubectl get all -n spring-docker-demo
```

### Tail the logs 
```
    kubectl logs <POD_NAME> -n spring-docker-demo -f 
```

### Port-forwarding is required in case you use docker as driver for minikube
```
    minikube service spring-docker-service -n spring-docker-demo
    #or
    # kubeclt port-forward svc/webapp-service <CUSTOME_LOCAL_PORT>:<K8S/SERVICE/POD PORT>
```

### Delete your deployment
```
    kubectl delete -f springboot-k8s-deployment.yaml -n spring-docker-demo
```