# GloFinder: AI-empowered QuPath plugin for WSI-level glomerular detection, visualization, and curation
<img src="https://github.com/hrlblab/PathVisual/blob/master/img/Screenshot%20from%202024-11-11%2013-16-08.png" width="768">


This is a QuPath extension for Weighted Circle Fusion(WCF)

This is a part of the following paper. Please cite it when you use this project. You will also cite the [CircleNet Journal Paper](https://ieeexplore.ieee.org/document/9585500)
or [CircleNet Conference Paper](https://link.springer.com/chapter/10.1007/978-3-030-59719-1_4)

## Build and Install the extension

### Set up the CircleNet environment
you can refer the [Circlenet repository](https://github.com/hrlblab/CircleNet) for environment setting up. Please follow the instruction in [INSTALL.md](https://github.com/hrlblab/CircleNet/blob/master/docs/INSTALL2023.md)there.

After that, you should change the environment path in [GLOMainCommand.java](https://github.com/hrlblab/PathVisual/blob/master/src/main/java/qupath/ext/template/GLOMainCommand.java) to your environment path.And Please change desktopDir to your desktop path, which is also defined in [GLOMainCommand.java].

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

The extension here will install a new command `Java extension` under the `Extensions` menu in QuPath.

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
2.Select  `Extensions`  >`Java extension` >  `Run GLO Detection`  from the menu bar.<br>

## How to create a simple extension

This video demonstrates how to create a simple QuPath plugin to execute your existing Python code. It covers the essential steps to set up the plugin, integrate Python scripts, and run custom analyses within the QuPath environment.<br>
[Click here to watch the video on creating a QuPath plugin](https://youtu.be/T_TlwO1F628)



## Citation
If you find this project useful for your research, please use the following BibTeX entry.
```
@article{yue2024weighted,
  title={Weighted Circle Fusion: Ensembling Circle Representation from Different Object Detection Results},
  author={Yue, Jialin and Yao, Tianyuan and Deng, Ruining and Liu, Quan and Xiong, Juming and Yang, Haichun and Huo, Yuankai},
  journal={arXiv preprint arXiv:2406.19540},
  year={2024}
}

@article{yue2025glofinder,
  title={GloFinder: AI-empowered QuPath plugin for WSI-level glomerular detection, visualization, and curation},
  author={Yue, Jialin and Yao, Tianyuan and Deng, Ruining and Lu, Siqi and Guo, Junlin and Liu, Quan and Xiong, Juming and Yin, Mengmeng and Yang, Haichun and Huo, Yuankai},
  journal={Journal of Pathology Informatics},
  pages={100433},
  year={2025},
  publisher={Elsevier}
}
```

## Acknowledgement
[Qupath](https://qupath.github.io/)
