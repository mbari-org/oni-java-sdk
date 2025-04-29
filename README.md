# oni-java-sdk

## To regenerate the SDK

1. Copy the open api yaml file into each project's src/main/resources folder as docs.yaml
2. Some may need the openapi version changed to 3.0.0 as kiota does not support 3.1.0
3. Run the following command in the project's root directory

```shell
kiota generate -l java -c Oni -n org.mbari.vars.oni.sdk.kiota -d src/main/resources/docs.yaml -o ./src/main/java/org/mbari/vars/oni/sdk/kiota
```
