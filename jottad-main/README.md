# jottad-cli


![68747470733a2f2f696d672e6573612e696f2f75706c6f6164732f70726f64756374696f6e2f6174746163686d656e74732f31373539362f323032312f30342f31302f3130313539302f36353466626333342d353933622d343232342d613035342d6535306361633162616165612e737667](https://github.com/NikolayTach/nix_patch/assets/42199859/c41c9c94-3e2e-4895-b88e-33787d682a4d)
<img width="120" alt="Screenshot from 2024-03-19 18-03-08.png (15.8 kB)" src="https://raw.githubusercontent.com/NikolayTach/nix_patch/main/logos.png">


Great package registration tool that is used to parse code through older nix repos on  jottacloud-cli

# nix-env
```
nix-env -iA nixos.jotta-cli
```
# Nix-Configuration

```
  environment.systemPackages = [
    pkgs.jotta-cli
  ];
```

# nix-shell

```
nix-shell -p jotta-cli
```
