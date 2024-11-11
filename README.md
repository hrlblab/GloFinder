# QuPath extension WCF

This is a QuPath extension for Weighted Circle Fusion(WCF)

This is a part of the following paper. Please cite it when you use this project. You will also cite the [CircleNet Journal Paper](https://ieeexplore.ieee.org/document/9585500)
or [CircleNet Conference Paper](https://link.springer.com/chapter/10.1007/978-3-030-59719-1_4)

## Build and Install the extension

### Set up the CircleNet environment
you can refer the [Circlenet repository](https://github.com/hrlblab/CircleNet) for environment setting up. Please follow the instruction in [INSTALL.md](https://github.com/hrlblab/CircleNet/blob/master/docs/INSTALL.md)there.

After that, you should change the environment path in [GLOMainCommand.java](https://github.com/hrlblab/PathVisual/blob/master/src/main/java/qupath/ext/template/GLOMainCommand.java) to your environment path.

### Building your extension
Building the extension with Gradle should be pretty easy - you don't even need to install Gradle separately, because the 
[Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html) will take care of that.

Open a command prompt, navigate to where the code lives, and use
```bash
gradlew build
```

The built extension should be found inside `build/libs`.

### Extension Installation
<img src="https://github.com/hrlblab/PathVisual/blob/master/img/trim.86A575A3-1320-4A70-B5CC-FC0C61F263CA%202.gif" width="768">

You can drag this onto QuPath to install it.
You'll be prompted to create a user directory if you don't already have one.

The minimal extension here doesn't do much, but it should at least install a new command under the 'Extensions' menu in 
QuPath.

> In case your extension contains external dependencies beyond what QuPath already includes, you can create a 
> [single jar file](https://imperceptiblethoughts.com/shadow/introduction/#benefits-of-shadow) that bundles these along 
> with your extension by using
> ```bash
> gradlew shadowJar
> ```
> If you don't do that, you'll need to drag *all* the extra dependences onto QuPath to install them as well.



## Usage


<img src="https://github.com/hrlblab/PathVisual/blob/master/img/wcf_show.gif" width="768">
1.Drag the image into Qupath<br>
2.Select `Extensions` >`Java extension`> `Run GLO Detection` from the menu bar.<br>


This video demonstrates how to create a simple QuPath plugin to execute your existing Python code. It covers the essential steps to set up the plugin, integrate Python scripts, and run custom analyses within the QuPath environment.<br>
[Click here to watch the video on creating a QuPath plugin](https://youtu.be/T_TlwO1F628)



## Citation
[Qupath](https://qupath.github.io/)

## Acknowledgement
